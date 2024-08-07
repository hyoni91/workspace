
-- 서브쿼리 : 하나의 쿼리 안에 또 다른 쿼리가 존재
-- 서브 쿼리는 반드시 ()안에 기재할 것

-- 사원 이름이 '김사랑'인 사원이 소속된 부서명을 조회

SELECT *
FROM emp; -- 김사랑씨는 부서번호 20번이다.

SELECT DNAME
FROM dept;  -- 부서 번호가 20번이면 인사부이다.


SELECT DNAME
FROM dept
WHERE DEPTNO = 20 ;  -- 이렇게 되면 김사랑이 소속된  부서명을 조회하게 된다.  (조건 ENAME = 20)

SELECT DEPTNO
FROM emp
WHERE ENAME = '김사랑';  -- 20번인것을 안거는 결국EMP를 조회하게 되서..  (셀렉트 값 : 20)



-- 두 쿼리를 합침 (WHERE절에 서브쿼리를 넣어줌)
SELECT DNAME
FROM dept
WHERE DEPTNO = (SELECT DEPTNO
						FROM emp
						WHERE ENAME = '김사랑');   -- (이 절의 쿼리 값은 DEPTNO가 결국 20! DEPTNO에 있는 것임 )


-- 모든 사원의 평균 급여보다 더 많은 급여를 갖는 사원의 사번 이름 급여를 조회
SELECT AVG(SAL)
FROM emp;  -- 사원의 평균 급여

SELECT * FROM emp; 

SELECT EMPNO, ENAME, SAL
FROM emp
WHERE 463.5714 < SAL;  -- 평균 급여보다 많은 급여 


SELECT EMPNO, ENAME, SAL
FROM emp
WHERE (SELECT AVG(SAL)
			FROM emp) < SAL;


-- 인사부에 소속된 직원 중 하반기에 입사한 사원들의 사번 이름 입사일 조회
-- 입사일은 YYYY년 mm월 dd일 형태로 조회
-- 상반기는 1 ~ 6월 중 입사한 사원

SELECT * FROM emp;    -- hiredate (입사)
SELECT * FROM dept;   -- 인사부 20번

SELECT DEPTNO
FROM dept
WHERE DNAME = '인사부';  -- 인사부는 번호가 몇번 ?  20번 서브쿼리가 된다.


SELECT EMPNO, ENAME,   DATE_FORMAT( HIREDATE, '%Y년 %m월 %d일') AS HIREDATE
FROM emp
WHERE MONTH(HIREDATE) >= 7
AND DEPTNO = (SELECT DEPTNO
					FROM dept
					WHERE DNAME = '인사부');



-- 사번 사원명 부서번호 부서명 조회

SELECT 
EMPNO
,ENAME
,(SELECT DNAME 
FROM dept WHERE DEPTNO = emp.DEPTNO) AS DNAME   
FROM emp;  

-- DEPTNO는 EMP와 DEPT가 함께 가지는 컬럼 (FK) 
-- DNAME은 여러개의 행을 가지기 때문에 하나의 행을 가질 수 있도록 WHERE절에 기입
--  WHERE DEPTNO = emp.DEPTNO  = DEPTNO가 
-- 즉, EMP의 부서번호와 DEPT의 부서번호가 일치하면 조회해주세요 (EMP테이블과 대입해서 같은 것만 뽑음)



-- 글 번호가 10번 이하인 게시글의 글 번호, 제목, 작성자 아이디, 작성자 이름 조회
-- 조인과 서브쿼리 둘 다 풀어보기

SELECT * FROM board;
SELECT * FROM board_member;

-- 조인
SELECT BOARD_NUM, B.TITLE, M.MEM_ID, M.MEM_NAME
FROM board B, board_member M
WHERE B.MEM_ID = M.MEM_ID
AND BOARD_NUM  < 11;


-- 서브쿼리 (권한추가)
SELECT BOARD_NUM, TITLE, MEM_ID,
		(SELECT MEM_NAME
			FROM BOARD_MEMBER
			WHERE MEM_ID = board.MEM_ID) AS MEM_NAME,
			(SELECT MEM_ROLE
			FROM BOARD_MEMBER
			WHERE MEM_ID = board.MEM_ID) AS MEM_ROLE
FROM board
WHERE BOARD_NUM < 11;


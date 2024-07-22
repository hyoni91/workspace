
-- 여러 테이블의 내용을 동시에 조회하기(JOIN)
-- 하나의 테이블은 최대한 중복없이 만드는것이 좋다. ---> 결과: 테이블을 나누는 경우가 많다.



-- EMP테이블의 사원의 부서명을 알고 싶으면 DEPT를 봐야함
SELECT * FROM emp;
SELECT * FROM dept;

-- 사원 번호, 사원명, 부서명 조회하기
-- 밑에처럼 쿼리를 적용시키면 데이터가 안 맞음
SELECT EMPNO, ENAME, DNAME
FROM emp, dept;


-- JOIN 조건 : 두 테이블이 공통으로 지니는 컬럼의 값이 같은 데이터만 조회
-- 테이블명.컬럼명 !
-- 테이블 명에도 별칭 사용 가능, 단 AS는 생략하는 것이 좋음 (오라클은 테이블명 별칭에 AS를 사용하지 않기 때문에)
-- 별칭을 사용한 경우  테이블별칭.컬럼명
-- SELECT절에서 테이블명 생략이 가능한 경우: 테이블의 별칭이 없을 경우와, 컬럼명이 겹치지 않을때만 가능
-- SELECT 사원.EMPNO, 사원.ENAME, 부서명.DNAME
-- FROM emp 사원 , dept 부서명
-- WHERE 사원.DEPTNO = 부서명.DEPTNO


-- 실무에서 자주 쓰는 문법
-- 사원번호, 사원명, 직급, 부서번호, 부서명, 각 부서의 지점
SELECT E.EMPNO, E.ENAME, E.JOB, D.DNAME, D.LOC, E.DEPTNO
FROM emp E, dept D
WHERE E.DEPTNO = D.DEPTNO;

-- 직급이 대리인 사원들의 사원번호, 사원명, 직급, 부서번호, 부서명, 각 부서의 지점
SELECT E.EMPNO, E.ENAME, E.JOB, D.DNAME, D.LOC, E.DEPTNO
FROM emp E, dept D
WHERE E.DEPTNO = D.DEPTNO
AND JOB = '사원' ;



-- 조회 시 데이터를 정렬하여 조회하기
SELECT * FROM emp;

-- 급여 기준 오름차순 정렬 하기 (사번, 사원명, 급여) --> 낮은 사람부터 높은 사람 순으로 (올라가는 순서~~)
SELECT EMPNO, ENAME, SAL
FROM emp
ORDER BY SAL ASC;

-- 부서번호가 30번이 아닌 사원들의 사원명, 부서번호 조회 
-- 사원명 기준 내림차순으로 정렬
-- ORDER BY는 쿼리문에서 항상 마지막에 옴
SELECT ENAME, DEPTNO
FROM emp
WHERE DEPTNO != 30
ORDER BY ENAME DESC;



-- 부서명이 인사부가 아니면서 급여가 300이상의 사원들의
-- 사번, 사원명, 부서번호, 부서명, 급여 조회
-- 부서번호 기준 오름차순
SELECT EMPNO, ENAME, EMP.DEPTNO, DNAME, SAL
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO
AND DNAME != '인사부' AND SAL >= 300
ORDER BY emp.DEPTNO;


-- 직급기준 오름차순(ㄱ,ㄴ,ㄷ 순) 후에 급여기준 오름차순
-- 정렬이 2개 이상일 경우 ','로 이어준다. 결과 순서는 적은 순서대로 정렬을 해준다.
-- 결과 : 직급 오름차순 후 같은 직급 안에서 급여 오름차순 됨
-- 정렬되는 컬럼이 여러개 있으면 각각의 정렬된 컬럼안에서 정렬이 된다.
SELECT EMPNO, ENAME, JOB, SAL
FROM emp
ORDER BY JOB ASC, SAL ASC
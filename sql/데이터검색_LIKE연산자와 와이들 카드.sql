SELECT * FROM emp;


-- 사원명 ''이'란 글자가 포함된 사원의 모든 정보를 조회
-- 포함 여부 조회 :  LIKE 연산자와 와일드 카드를 함께 사용.
-- 와일드 카드 : % , _
-- % :글자 수 제한이 없는 랜덤한 문자
-- '_' : 한 글자의 랜덤한 문자
SELECT *
FROM emp
WHERE ENAME LIKE '%이%';


-- 이름은 세 글자이며 가운데 글자가 '이' 인 이름 조회
SELECT *
FROM emp
WHERE ENAME LIKE '_이_';   


-- 이름은 세 글자이며 첫 번째 글자가 '이'인 이름 조회
SELECT *
FROM emp
WHERE ENAME LIKE '이__';   



-- 마지막 글자가 '이'로 끝나는 모든 이름을 조회
SELECT *
FROM emp
WHERE ENAME LIKE '%이';

-- 첫 글자가 '이'로 시작하는  모든 이름을 조회
SELECT *
FROM emp
WHERE ENAME LIKE '이%';


-- 두번째 글자가 '이'인 모든 이름을 조회
SELECT *
FROM emp
WHERE ENAME LIKE '_이%';


-- SELECT 연결
-- (FROM 테이블명의 데이터 수 만큼 나옴)
SELECT 'JAVA', 1+1 FROM basic_board;

-- 문법 공부할 때 사용함 (테이블명 없으면 값은 하나)
SELECT 'JAVA', 1+1; 

-- 문자열 연결함수
SELECT CONCAT('I','WANT', 'TO', 'GO', 'HOME');
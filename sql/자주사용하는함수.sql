-- 쿼리 문법 연습할 때 FROM절 없이 사용하기도 함.
SELECT 'JAVA', 123 , 'HI';
SELECT 'JIN', 'HELLO';

-- 문자열과 관련된 함수 

-- 많이 사용하는 함수 
-- CONCAT : 문자열 나열
SELECT 'JIN', 'HELLO', CONCAT('JAVA','HELLO');
SELECT CONCAT('123','CONCAT',123);

-- 필요한 데이터를 가공해서 출력 가능 : 출력 예) 5_1번 글   (보드 넘과 _ 하이픈 타이틀명 연결해서 출력됨, 컬렴명은 별칭인 보드 인포로..)
SELECT BOARD_NUM, TITLE, CONCAT(BOARD_NUM, '_', TITLE) AS BOARD_INFO
FROM board;


-- LENGTHB(str) : 문자열의 길이
SELECT 'JAVA', LENGTH('JAVA');

-- SUBSTRING(str[원본글],pos[추출 시작점, 추출될 문자 수]) : 일부 문자열 추출 (시작은 1부터 ! 0아님 주의~~)
-- 아래 예제는 3번째 문자부터 출력하라는 명령어임
SELECT 'ABCDEFG', SUBSTRING('ABCDEFG',3);

-- 매개 변수가 두개일 경우 (시작점 , 문자 수)
SELECT 'ABCDEFG', SUBSTRING('ABCDEFG',3,2) ;


-- UPPER(str) : 대문자 출력     출력 예) MYSQL
-- LOWER(str)  : 소문자 출력   출력 예) mysql
SELECT 'Mysql', UPPER('Mysql'), LOWER('Mysql');

-- LPAD(str, len [,padstr]) : 문자 또는 숫자의 자릿수 맞추기 (해당 문자열 왼쪽에)
-- RPAD(str, len [, padstr]) : 문자 또는 숫자의 자릿수 맞추기 (해당 문자열의 오른쪽에)
-- 매개변수 : (해당 문자열, 길이, 무엇으로 메꾸나?)
-- 해당 함수는 일렬번호를 생산할 때 자주 쓰인다!
SELECT LPAD('JAVA', 6 , '#'), RPAD('JAVA', 8 , '#'), LPAD('1', 5 , '0');



-- 띄어쓰기도 하나의 문자!
SELECT '  AA BB  ';
-- LTRIM(str), RTRIM(str), TRIM()  : 왼쪽 공백 제거, 오른쪽 공백 제거, 좌우 공백 제거
-- 여기서 주의 할 점은 문자와 문자 사이의 공백은 제거 안해줌
SELECT '  AA BB  ', LTRIM('  AA BB  '), RTRIM('  AA BB  '), TRIM('  AA BB  ');


-- REPLACE(해당 문자열, 찾는 문자, 바꿀 문자) : 문자열 치환 함수 
SELECT '010 1111 2222', REPLACE('010 1111 2222', ' ', '-');




-- 수와 관련된 함수 

-- ROUND(반올림 할 수, 자릿수) : 반올림 함수
SELECT 123.456, ROUND(123.456, 1);

-- 연산 가능, 나누기는 소수점까지 나옴!
SELECT 10+10, 10-2, 2*2, 2/2 ;

-- 라운드 함수 안에 연산 넣어도 됨
SELECT ROUND(15/4, 1);

-- MOD() : 나머지 구하기
SELECT MOD(10,5);



-- ----------------------------------------------------------------------------------------------

SELECT * FROM emp;


-- 모든 사원의 급여 총 합 및 커미션 총합
-- SUM() 
-- SUM이 안되는쿼리 예제 : SUM(10,10)
-- SUM()은 다른 쿼리와 다르게 결과 값은 단 한개가 나옴
SELECT SUM(SAL), SUM(COMM) FROM emp;

-- SUM() 함수와 위의 함수와의 다른 점
-- 해당 함수를 실행해 보면 데이터의 개수만큼 결과 값이 나온다.
SELECT LENGTH(ENAME) , LENGTH(JOB) FROM emp;


-- 주의점 
-- 모든 사원의 이름과 급여의 합을 조회 --> 결과: 사원이 한 명 밖에 안 나옴
SELECT ENAME, SUM(SAL) FROM emp;


-- 따로 따로 조회 해야함 
-- *** 쿼리 조회 시 조회하는 모든 컬럼의 조회 행 수는 모두 일치해야 한다!!!! ***
SELECT ENAME FROM emp;
SELECT SUM(SAL) FROM emp;


-- 단일행 함수 : SUM()과 같이 데이터 개수와 상관없이 하나의 결과만 갖는 함수
-- SUM(), MAX(), MIN(), AVG(), COUNT()
SELECT SUM(SAL), MAX(SAL), MIN(SAL), AVG(SAL), COUNT(SAL) 
FROM emp;

-- COUNT() 함수의 유의점
-- 테이블에 있는 데이터의 개수
SELECT COUNT(*) FROM emp;
-- COUNT()함수 안에는 PK를 넣는 것을 추천한다 ---> NULL등 방지 
SELECT COUNT(EMPNO) FROM emp;



-- 평균 계산 시 NULL데이터 주의하기
-- 보통 합계는 값이 있는 것만 계산한다.
-- 사원 14중, 4명만 커미션이 있는 경우 해당 쿼리는 4명의 커미션의 평균이다.
SELECT AVG(COMM) FROM emp;
SELECT * FROM emp;


-- 그렇다면 사원 전체를 기준으로 커미션을 알고 싶을 경우
-- 단일행 함수 아님!!!!!!!!!!!!!!!!!!!!
-- IFNULL(컬럼명, 무엇으로? ) : NULL값을 치환하는 함수 (숫자, 문자 둘 다 가능)
SELECT COMM, IFNULL(COMM,0) FROM emp;
-- 함수 안에 함수를 감쌀 수 있음 
SELECT ROUND(AVG(IFNULL(COMM, 0)), 2) FROM emp;
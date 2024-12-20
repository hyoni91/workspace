CREATE TABLE JOIN_STU (
	STU_NUM INT PRIMARY KEY
	, STU_NAME VARCHAR(50)
	, MAJOR VARCHAR(50)
);

INSERT INTO JOIN_STU VALUES (1, '김자바', '자바전공');
INSERT INTO JOIN_STU VALUES (2, '이자바', '자바전공');
INSERT INTO JOIN_STU VALUES (3, '박자바', '자바전공');
INSERT INTO JOIN_STU VALUES (4, '윤회계', '회계전공');
INSERT INTO JOIN_STU VALUES (5, '정회계', '회계전공');
INSERT INTO JOIN_STU VALUES (6, '최회계', '회계전공');

CREATE TABLE JOIN_SCORE (
	SCORE_NUM INT PRIMARY KEY
	, SCORE INT
	, STU_NUM INT
);

INSERT INTO JOIN_SCORE VALUES (1, 80, 1);
INSERT INTO JOIN_SCORE VALUES (2, 70, 2);
INSERT INTO JOIN_SCORE VALUES (3, 70, 5);
INSERT INTO JOIN_SCORE VALUES (4, 85, 6);
INSERT INTO JOIN_SCORE VALUES (5, 89, 7);
INSERT INTO JOIN_SCORE VALUES (6, 77, 8);

SELECT * FROM JOIN_STU;
SELECT * FROM JOIN_SCORE;


-- 아래 쿼리의 실행결과 조회되는 데이터 수는 몇 개인가? 4개
SELECT STU.STU_NUM, STU_NAME, SCORE 
FROM JOIN_STU STU, JOIN_SCORE SCORE
WHERE STU.STU_NUM = SCORE.STU_NUM;


-- 조인은 db종류에 따라 문법이 따로 존재한다. 
-- 하지만 모든 db에서 공용으로 사용 가능 문법도 존재 => "ANSI"  
-- INNER JOIN : 조인 할 테이블  
-- ON : 조인 조건
-- 일반 조건은 ON절 다음, WHERE 절에 쓰면 된다.
SELECT STU.STU_NUM, STU_NAME, SCORE 
FROM JOIN_STU STU INNER JOIN JOIN_SCORE SCORE
ON STU.STU_NUM = SCORE.STU_NUM;


-- OUTER JOIN 으로 모든 학생의 정보를 조회
SELECT STU.STU_NUM, STU_NAME, IFNULL(SCORE,0) AS SCORE
FROM JOIN_STU STU LEFT OUTER JOIN JOIN_SCORE SCORE
ON STU.STU_NUM = SCORE.STU_NUM;


-- OUTER JOIN 으로 점수를 가진 모든 정보를 조회
SELECT STU.STU_NUM, STU_NAME, SCORE
FROM JOIN_STU STU RIGHT OUTER JOIN JOIN_SCORE SCORE
ON STU.STU_NUM = SCORE.STU_NUM;


-- 아래 문법으로 OUTER JOIN 사용하기! (오라클에서 사용가능)
SELECT STU.STU_NUM, STU_NAME, SCORE 
FROM JOIN_STU STU, JOIN_SCORE SCORE
-- WHERE STU.STU_NUM = SCORE.STU_NUM;  -- INNER JOIN
-- WHERE STU.STU_NUM = SCORE.STU_NUM(+);  -- LEFT OUTER JOIN
-- WHERE STU.STU_NUM(+) = SCORE.STU_NUM;  -- RIGHT OUTER JOIN


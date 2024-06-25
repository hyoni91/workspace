
-- DB 연결 연습용 테이블

CREATE TABLE TEST_MEMBER(
	MEM_NUM INT PRIMARY KEY	
	, MEM_NAME VARCHAR(50) 
	, MEM_AGE INT
	, MEM_ADDR VARCHAR(50)

);


SELECT * FROM test_member;

-- DATA 삽입
INSERT INTO test_member VALUES (1, '김남준', 30, '서울');
INSERT INTO test_member VALUES (2, '박지민', 25, '광주');
INSERT INTO test_member VALUES (3, '김석진', 33, '부산');
INSERT INTO test_member VALUES (4, '전정국', 27, '마산');
INSERT INTO test_member VALUES (5, '민윤기', 31, '대구');
COMMIT;

SELECT *
FROM test_member;


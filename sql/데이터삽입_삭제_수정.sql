CREATE TABLE TEST_MEMBER(
	MEM_NUM INT PRIMARY KEY   -- PRIMARY KEY : 중복 불가, NULL 불가	
	, MEM_NAME VARCHAR(50) 
	, MEM_AGE INT
	, MEM_ADDR VARCHAR(50)

);

SELECT * FROM test_member;


-- 데이터 삽입
-- INSERT INTO 테이블명 (컬럼들 (행)) VALUES (값들);
-- 입력한 컬럼 순서대로 값을 저장시켜야 한다.
INSERT INTO test_member (MEM_NUM, MEM_NAME, MEM_AGE, MEM_ADDR) 
VALUES (10, 'KJS', 26, '울산');
COMMIT;
ROLLBACK;

-- 데이터 삽입 시 주의점!
-- 데이터베이스는 데이터 오류를 엄격히 금지하므로 
-- 정보입력을 마친 후,  SELECT 해서 이상이 없으면 저장한다.
-- 저장을 하려면 마지막에 COMMIT; 명령어로 데이터 변화 확정
-- 잘못된 변화(데이터수정, 삭제, 삽입)가 있을 때 변화를 취소하고 싶다면
-- ROLLBACK; 명령어를 실행한다.
-- COMMIT; 과 ROLLBACK; 명령어는 데이터 변화 문법 마지막에 입력해 준다.
-- 주의할 점 : COMMIT후 ROLLBACK은 실행이 안된다.
-- 주의할 점2 : 실행시킬 때는 실행시킬 문법 위에 커서를 올리고 컨트롤 시프트 에프9를 꼭 눌러서 명령문 실행시키기

SELECT * FROM test_member;

INSERT INTO test_member (MEM_NUM, MEM_NAME, MEM_ADDR, MEM_AGE) 
VALUES (11, 'SYS', '안동', 40);
COMMIT;



-- 컬럼명은 반드시 모든 컬럼이 작성 될 필요는 없다.
-- 컬럼을 작성하지 않으면 초기값은 NULL (빈값 아님!) 을 가진다.
INSERT INTO test_member (MEM_NUM, MEM_NAME) 
VALUES (12, '짱구님');
COMMIT;


-- PRIMARY KEY 값은 NULL을 가질 수 없기 때문에 반드시 작성해야 한다.
INSERT INTO test_member (MEM_NAME, MEM_AGE) 
VALUES ('짱아님', 3);  -- 오류!! FIELD 'MEM_NUM' DOESN'T  HAVE A DEFAULT VALUE



-- 테이블 생성 시 작성한 컬럼명 순서대로 데이터를 넣는다면
-- 테이블 컬럼명은 생략이 가능하다. (단, 모든 컬럼 값이 들어가야 한다.)
INSERT INTO test_member
VALUES (13, '짱아님', 3, '인천');
COMMIT;


SELECT * FROM test_member;

-- 데이터 수정 [UPDATE]
-- UPDATE 데이블명 SET 컬럼명 = 값 WHERE 조건 ;
-- 조건이 없으면, 모든 데이터가 바뀜 (해당 컬럼명 데이터)
UPDATE test_member 
SET MEM_NAME = '훈이' ; 
ROLLBACK;

UPDATE test_member
SET MEM_NAME = '훈이'
WHERE MEM_NUM = 13 ;
COMMIT;

UPDATE test_member
SET MEM_NAME = '김진수', MEM_AGE = 20
WHERE MEM_NAME = 'KJS';
COMMIT;

-- 데이터삭제 [DELETE]
-- DELETE FROM 테이블명 [WHERE 조건]
-- 조건이 없으면 데이터가 전부 삭제됨
DELETE FROM test_member;
ROLLBACK;

-- 40살 이상인 회원을 모두 삭제
DELETE FROM test_member;
WHERE MEM_AGE > 40;
ROLLBACK;

SELECT * FROM test_member;
COMMIT;


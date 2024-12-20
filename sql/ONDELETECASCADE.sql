-- FK 제약의 테이블을 한번에 삭제시키기
DROP TABLE TEST_ORDER;
DROP TABLE TEST_ITEM;

CREATE TABLE TEST_ITEM(
	ITEM_CODE INT AUTO_INCREMENT PRIMARY KEY
	, ITEM_NAME VARCHAR(30) NOT NULL
);

INSERT INTO TEST_ITEM VALUES(1,'상품1');
INSERT INTO TEST_ITEM VALUES(2,'상품2');
INSERT INTO TEST_ITEM VALUES(3,'상품3');

SELECT *FROM TEST_ITEM;

CREATE TABLE TEST_ORDER(
	ORDER_NUM INT AUTO_INCREMENT PRIMARY KEY
	, BUYER VARCHAR(50) NOT NULL
	, ITEM_CODE INT NOT NULL REFERENCES TEST_ITEM(ITEM_CODE) ON DELETE CASCADE
);

INSERT INTO TEST_ORDER VALUES(1,'AAA',1);
INSERT INTO TEST_ORDER VALUES(2,'BBB',1);
INSERT INTO TEST_ORDER VALUES(3,'CCC',3);

SELECT * FROM TEST_ORDER;

-- 외래키가 걸려있어도 삭제할 수 있는 방법
DELETE FROM TEST_ITEM WHERE ITEM_CODE = 1;
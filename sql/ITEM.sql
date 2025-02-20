
CREATE TABLE ITEM_INFO(
ITEM_NUM INT AUTO_INCREMENT PRIMARY KEY
, ITEM_NAME VARCHAR(50) NOT NULL
, ITEM_PRICE INT NOT NULL
, SELLER VARCHAR(30) NOT NULL 
, ITEM_INTRO VARCHAR(100)
, REG_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM ITEM_INFO;

CREATE TABLE ORDERT_INFO(
ORDER_NUM INT AUTO_INCREMENT PRIMARY KEY
, BUY_ITEM_NAME VARCHAR(50) 
, BUY_ITEM_PRICE INT
, BUYER VARCHAR(50) NOT NULL
, BUY_CNT INT
, BUY_PRICE INT
, BUY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP 
);

SELECT * FROM ORDERT_INFO;

UPDATE ITEM_INFO
SET ITEM_NAME = '파란구두'
WHERE ITEM_NUM = 1;
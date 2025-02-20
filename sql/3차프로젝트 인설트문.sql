

-- 3차 프로젝트 
-- 카테 등록
INSERT INTO CATEGORY(
	CATE_NAME
) VALUES(
	'주사용품'
);


-- 상품등록
INSERT INTO PRODUCTS(
	PRODUCT_NAME
	,CATE_NUM
	,PRODUCT_PRICE
	,STOCK
	,DETAIL
) VALUES(
	'일회용 주사기'
	,4
	,3000
	,500
	,'일회용 주사기 60cc'
);


-- 최초 재고 등록 


INSERT INTO inventory(
 CATE_NUM
 ,PRODUCT_NUM
 ,PRODUCT_NAME
 ,INITIAL_STOCK
 ,CURRENT_STOCK
 ,INCOMING_QTY
 ,OUTGOING_QTY
) VALUES(
	4
	,4
	,'일회용 주사기'
	,500
	,500
	,0
	,0
);



-- 주문 등록
INSERT INTO order_requests(
	PRODUCT_NUM
	,QUANTITY
	,CUSTOMER_NUM
) VALUES(
	4
	,30
	,13
);

-- 수주 등록 
INSERT INTO ORDERS(
	REQUEST_NUM
) VALUES(
	13
);
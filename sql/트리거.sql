

-- 트리거를 사용하여 발주 테이블에 주문이 들어오면 수주테이블에 자동 저장

DROP TRIGGER order_orderRequest_update;


CREATE TRIGGER AFTER_INSERT_ORDER_REQUESTS
AFTER INSERT ON ORDER_REQUESTS
FOR EACH ROW
   INSERT INTO ORDERS (REQUEST_NUM, ORDER_STATUS, ORDER_DATE)
   VALUES (new.REQUEST_NUM, '배송대기', NOW());

	

-- 트리거 UPDATE 주문취소 (거래처>공급사)			
DELIMITER //			
			
CREATE TRIGGER order_orderRequest_update			
	AFTER UPDATE		
	ON ORDER_REQUESTS		
	FOR EACH ROW		
BEGIN			
	IF NEW.REQUEST_STATUS='주문취소' THEN		
		UPDATE orders	
		SET ORDER_STATUS='주문취소'	
		WHERE REQUEST_NUM=NEW.REQUEST_NUM;	
	END IF;		
END; //			
			
DELIMITER;			
order_orderRequest_update_cancel


DROP TRIGGER 트리거 이름

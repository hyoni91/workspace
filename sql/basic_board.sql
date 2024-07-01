
-- [게시판 프로그램 테이블 생성]
-- CREATE TABEL 테이블명 (
-- 컬럼명 데이터타입 (VARCHAR 뒤에 글 몇자) [제약조건들] ) ;
-- DATETIME(날짜, 시, 분, 초)
-- 제약 조건 : PRIMARY KEY ,NOT NULL 등등
-- 쉼표로 나열

-- [데이블 삭제]
-- 주의점 : 테이블 삭제와 데이터 삭제는 다름!
-- 데이트는 DELETE FROM 테이블명 [WHERE]
-- 함부로 DELETE FROM 하면 안돼!!
DROP TABLE basic_board;

CREATE TABLE BASIC_BOARD(
	B_NUM INT AUTO_INCREMENT PRIMARY KEY 
	, B_TITLE VARCHAR(50) NOT NULL
	, B_WRITER VARCHAR(50) NOT NULL
	, B_CONTENT VARCHAR(100)
	, B_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, READ_CNT INT DEFAULT 0
);

SELECT * FROM basic_board;

SELECT BOARD_NUM
, B_TITLE
, B_WRITER
, B_DATE
, READ_CNT
 FROM BASIC_BOARD
 WHERE B_TITLE LIKE '%안녕%';
WHERE B_WRITER LIKE '%석진%';


  INSERT
 INTO BASIC_BOARD(
 B_TITLE
, B_WRITER
, B_CONTENT
)
VALUES(
'안녕'
, '김석진'
, '테스트'
 );
 
 SELECT B_NUM, B_WRITER, B_TITLE, B_CONTENT
 FROM BASIC_BOARD
 WHERE B_NUM = 1;
 
 
 SELECT B_NUM, B_WRITER, B_TITLE, B_CONTENT
 FROM BASIC_BOARD
 WHERE B_NUM = 1;

INSERT INTO basic_board(B_TITLE, B_WRITER, B_CONTENT) 
VALUES('테이블완성', '아무개씨', '실행' );



-- 디폴트값을 준 날짜와 조회수 생략하고, NOT NULL 빼고 적어봄
INSERT INTO basic_board (B_NUM, B_TITLE B_WRITER) 
VALUES(1, '제목1', '아무개씨1');

-- 유니크 (NULL 중복 됨)
INSERT INTO basic_board (B_NUM, B_TITLE B_WRITER) 
VALUES(2, '제목2', '아무개씨2');



-- READ CNT 적으면 디폴트 값 무시하고 내가 적은걸로 INSERT
INSERT INTO basic_board 
(B_NUM, B_TITLE, B_WRITER, B_CONTENT, B_DATE, READ_CNT) 
VALUES(4, '제목4' ,'아무개4', '내용4' , '2024-07-01', 5);

-- READ CNT 안 적으면 디폴트 값 0
INSERT INTO basic_board 
(B_NUM, B_TITLE, B_WRITER, B_CONTENT, B_DATE) 
VALUES(5, '제목1' ,'아무개','없음', '2024-07-01');



-- 로그인, 게시글, 댓글 관련 기능이 포함된 게시판 프로젝트
-- 테이블 : 회원 정보, 게시글 정보, 댓글 정보

-- 회원 정보 테이블
-- MEM_ROLE : 회원 권한 정보. 이건 INPUT태그로 입력 받는 값이 아님 (USER로 디폴트!)
-- USE : 일반 회원 , ADMIN : 관리자
-- GENDER : 남성 'male' , 여성 'female' 들어 가도록 

DROP TABLE board_memeber;
CREATE TABLE BOARD_MEMBER(
 MEM_ID VARCHAR(50) PRIMARY KEY
 , MEM_PW VARCHAR(50) NOT NULL
 , MEM_NAME VARCHAR(50) NOT NULL
 , GENDER VARCHAR(10)  
 , MEM_ROLE VARCHAR(20) DEFAULT 'USER' 
);

-- 임시 회원 데이터
INSERT INTO board_member(MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES('java', '1111', '김자바', 'male', 'user');
INSERT INTO BOARD_MEMBER(MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES('admin', '1111', '관리자', 'female', 'admin');

SELECT * FROM board_member;


-- 게시글 정보 테이블 (회원만 게시글 작성 가능)
-- REFERENCES 테이블명(컬럼명)  : 참조해서 넣겠다! (외래키를 줌)
CREATE TABLE BOARD(
 BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
 , TITLE VARCHAR(50) NOT NULL
 , CONTENT VARCHAR(100)
 , MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID)   
 , CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);


-- 게시글 임시 데이터
INSERT INTO board(TITLE, CONTENT, MEM_ID) 
VALUES('1번 글','1번 내용','java');
INSERT INTO board(TITLE, CONTENT, MEM_ID) 
VALUES('2번 글','2번 내용','java');
INSERT INTO board(TITLE, CONTENT, MEM_ID) 
VALUES('3번 글','3번 내용','admin');

SELECT * FROM board;



-- 댓글 정보 테이블 (회원만 댓글 작성 가능)
CREATE TABLE BOARD_REPLY(
 REPLY_NUM INT AUTO_INCREMENT PRIMARY KEY
 , REPLY_CONTENT VARCHAR(50) NOT NULL
 , REPLY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
 , MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER(MEM_ID)
 , BOARD_NUM INT REFERENCES BOARD(BOARD_NUM)
);

-- 댓글 임시 데이터
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM) 
VALUES('댓글 1', 'java', 2 );
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM) 
VALUES('댓글 2', 'java', 3 );
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM) 
VALUES('댓글 3', 'java', 2 );
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM) 
VALUES('댓글 4', 'admin', 2 );
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM) 
VALUES('댓글 5', 'admin', 3 );

SELECT * FROM board_reply;


-- 데이터 조회 연습

-- 회원의 이름이 '김자바'인 회원이 작성한 게시글의 글번호, 제목, 작성자(ID, WRITER) 조회
-- 작성일 기준 최신글 부터 조회 (내림차순)
-- JOIN은 공통으로 지닌 값을 WHERE에 적어야함!
SELECT B.BOARD_NUM, B.TITLE, B.MEM_ID, M.MEM_NAME
FROM board B, board_member M
WHERE  B.MEM_ID = M.MEM_ID  -- MEM_ID같은 사람끼리 조인해야함!   
AND M.MEM_NAME = '김자바'
ORDER BY BOARD_NUM DESC;

-- 모든 게시글의 글 번호, 글 제목 , 작성자 및 해당 글에 작성된 댓글의 댓글 내용, 댓글 작성자, 댓글 작성일을 조회
-- 게시글 번호 기준 최신 순으로 정렬 후, 같은 게시글에 대한 댓글은 가장 최근에 달린 댓글 순으로 조회 
SELECT B.BOARD_NUM, B.TITLE,  B.MEM_ID, R.REPLY_CONTENT, R.MEM_ID, R.REPLY_DATE
FROM board B, board_reply R
WHERE B.BOARD_NUM = R.BOARD_NUM
ORDER BY B.BOARD_NUM DESC, R.REPLY_NUM DESC;



SELECT
B.BOARD_NUM
,B.TITLE
,M.MEM_NAME
,B.CREATE_DATE
FROM board B, BOARD_MEMBER M
WHERE B.MEM_ID = M.MEM_ID;

-- 시큐리티 연습용 회원 테이블

CREATE TABLE SECURITY_MEMBER (
	MEM_ID VARCHAR(50) PRIMARY KEY
	, MEM_PW VARCHAR(100) NOT NULL
	, MEM_NAME VARCHAR(50)
	, MEM_ROLE VARCHAR(30)
);

SELECT * FROM security_member;

-- id / 비번 / 권한 test --

-- 관리자 : admin / 1111 /ADMIN
-- 매니저 : manager / 1111 / MANAGER
-- 일반 : user / 1111 / USER


UPDATE security_member 
SET MEM_ROLE = 'USER'
WHERE MEM_ID = 'user';

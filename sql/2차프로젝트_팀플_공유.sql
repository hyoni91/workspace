

SELECT * FROM medical_member;



SELECT * FROM board
ORDER BY CREATE_DATE DESC
LIMIT 5;


GRANT ALL PRIVILEGES ON *.* TO 'team_mediclick'@'192.168.%' IDENTIFIED BY 'mariadb';

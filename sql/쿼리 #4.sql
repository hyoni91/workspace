
SELECT * FROM medical_dept;
SELECT * FROM medical_doctor;
SELECT * FROM medical_member;

INSERT INTO medical_dept(DEPT_NUM,DEPT_NAME) VALUES(1,'유방암');
INSERT INTO medical_dept(DEPT_NUM,DEPT_NAME) VALUES(2,'뇌종양');
INSERT INTO medical_dept(DEPT_NUM,DEPT_NAME) VALUES(3,'갑상선암');
INSERT INTO medical_dept(DEPT_NUM,DEPT_NAME) VALUES(4,'간암');
INSERT INTO medical_dept(DEPT_NUM,DEPT_NAME) VALUES(5,'폐암');
INSERT INTO medical_dept(DEPT_NUM,DEPT_NAME) VALUES(6,'혈액암');

INSERT INTO medical_doctor(DOC_NUM,DOC_NAME, DEPT_NUM) VALUES (7,'김현경', 1);
INSERT INTO medical_doctor(DOC_NUM,DOC_NAME, DEPT_NUM) VALUES (8,'민정흠', 2);
INSERT INTO medical_doctor(DOC_NUM,DOC_NAME, DEPT_NUM) VALUES (9,'유지현', 3);
INSERT INTO medical_doctor(DOC_NUM,DOC_NAME, DEPT_NUM) VALUES (10,'서은송', 4);
INSERT INTO medical_doctor(DOC_NUM,DOC_NAME, DEPT_NUM) VALUES (11,'김형진', 5);
INSERT INTO medical_doctor(DOC_NUM,DOC_NAME, DEPT_NUM) VALUES (12,'정다영', 6);

-- 의사 진료 조인
SELECT DOC_NAME, DEPT_NAME
FROM medical_dept, medical_doctor
WHERE medical_dept.DEPT_NUM = medical_doctor.DEPT_NUM;

INSERT INTO medical_member (
	MEM_NAME
	,MEM_TEL
	,MEM_RRN
)VALUES (
	'김수한무'
	,'01011112222'
	,'9604232222222'
);


UPDATE medical_dept
SET
DEPT_NAME = '자궁암'
WHERE DEPT_NAME = '간암';

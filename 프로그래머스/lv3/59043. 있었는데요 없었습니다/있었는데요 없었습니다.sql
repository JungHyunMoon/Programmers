-- 코드를 입력하세요
SELECT A.ANIMAL_ID, A.NAME from animal_ins as A

join animal_outs as B
on B.animal_id = A.animal_id
where A.datetime > B.datetime
order by A.datetime

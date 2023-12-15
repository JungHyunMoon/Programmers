SELECT MCDP_CD AS '진료과코드'
    , COUNT(PT_NO) AS '5월예약건수'
FROM APPOINTMENT
WHERE Year(APNT_YMD) = '2022' AND MONTH(APNT_YMD) = '05'
GROUP BY MCDP_CD
ORDER BY 5월예약건수, MCDP_CD;
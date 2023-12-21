SELECT O.`PRODUCT_ID`, P.`PRODUCT_NAME`, SUM(P.`PRICE` * O.`AMOUNT`) TOTAL_SALES FROM FOOD_ORDER O
JOIN FOOD_PRODUCT P
ON O.`PRODUCT_ID` = P.`PRODUCT_ID`
WHERE DATE_FORMAT(O.`PRODUCE_DATE`, "%Y-%m") = "2022-05"
GROUP BY O.`PRODUCT_ID`
ORDER BY TOTAL_SALES DESC, P.`PRODUCT_ID` ASC
/* 1ª Questão */



/* 2ª Questão */

SELECT
		CONCAT(i.fname, " ", i.lname) "Cliente"
FROM
		individual i,
        branch br,
        customer c
WHERE
		i.cust_id = c.cust_id
        AND
        c.address != br.address
UNION
SELECT
		b.name
FROM
		business b,
        branch br,
        customer c
WHERE
		b.cust_id = c.cust_id
        AND
        c.address != br.address
        

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


/* 3ª Questão */
SELECT
        CONCAT(e.fname, " ", e.lname) Funcionário,
        COUNT(a.open_emp_id) "Nº de Contas/ano"
FROM
		employee e,
        account a
WHERE e.assigned_branch_id = a.open_branch_id
GROUP by e.fname
#ORDER BY e.fname ASC 		# Ordem alfabética
#ORDER BY a.open_date ASC 	# Ordem de abertura das contas
        

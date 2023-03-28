/* 1. Junções Internas */

SELECT
	CONCAT(o.fname " ", o.lname) "Administrador",
    b.name "Empresa",
    c.city "Cidade"
FROM
	officer o,
    business b,
    customer c
WHERE
	o.cust_id = b.cust_id
    AND
    o.cust_id = c.cust_id;


/* 2. Junções Internas, Uniões e Seleções */

SELECT
	b.name "Cliente"
FROM
	business b,
    customer c,
    branch br
WHERE
	b.cust_id = c.cust_id
    AND
    br.address != c.address
UNION
SELECT
	CONCAT(i.fname, " ", i.lname)
FROM
	individual i,
    customer c,
    branch br
WHERE
	i.cust_id = c.cust_id
    AND
    br.address != c.address;


/* 3. Junção Externa, Agrupamento, Agregação e Ordenação */

SELECT
    CONCAT(e.fname, " ", e.lname) "Funcionário",
    CASE
    	WHEN COUNT(a.open_emp_id) = 0 THEN "Nenhuma"
        ELSE COUNT(a.open_emp_id)
    END "Nº de Transações"
FROM
	employee e
LEFT OUTER JOIN 
	account a 
ON 
	e.emp_id = a.open_emp_id
GROUP by 
	e.emp_id
ORDER by 
	e.fname, e.start_date;


/* 4. Junções Internas, Agrupamento, Agregação, União e Concatenação */

# Answer:
/*
ID	|	Cliente			|	Agência
------+-----------------------------+-------------------
15	|	John Spencer		|	Headquarters
27	|	Northeast Cooling Inc.	|	Woburn Branch
29	|	AAA Insurance Inc.	|	Quincy Branch
28	|	Superior Auto Body	|	So. NH Branch
*/

SELECT
	a.account_id "ID",
    b.name "Cliente",
    br.name "Agência"
FROM
	account a,
    business b,
    branch br
WHERE
	a.cust_id = b.cust_id
    AND
    a.open_branch_id = br.branch_id
GROUP BY
	br.name
HAVING
	MAX(a.avail_balance)
UNION
SELECT
	a.account_id,
    CONCAT(i.fname, " ", i.lname),
    br.name
FROM
	account a,
    individual i,
    branch br
WHERE
	a.cust_id = i.cust_id
    AND
    a.open_branch_id = br.branch_id
GROUP BY
	br.name
HAVING
	MAX(a.avail_balance)


/* 5. Visualização */

CREATE VIEW clients as
SELECT
	b.name "Cliente"
FROM
	business b,
    customer c,
    branch br
WHERE
	b.cust_id = c.cust_id
    AND
    br.address != c.address
UNION
SELECT
	CONCAT(i.fname, " ", i.lname)
FROM
	individual i,
    customer c,
    branch br
WHERE
	i.cust_id = c.cust_id
    AND
    br.address != c.address;

# Questão 2:
SELECT * from clients;

# Questão 4:

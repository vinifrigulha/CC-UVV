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
    account a,
    branch br,
    customer c
WHERE
	br.branch_id = a.open_branch_id
    AND
    a.cust_id = c.cust_id
    AND
    c.cust_id = b.cust_id
    AND
    br.city != c.city
UNION
SELECT
	CONCAT(i.fname, " ", i.lname)
FROM
	individual i,
    account a,
    branch br,
    customer c
WHERE
	br.branch_id = a.open_branch_id
    AND
    a.cust_id = c.cust_id
    AND
    c.cust_id = i.cust_id
    AND
    br.city != c.city;


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

SELECT
	a.account_id "ID da Conta",
    CONCAT(i.fname, " ", i.lname) "Cliente",
    br.name "Agência"
FROM
	branch br,
    account a, 
    customer c,
    individual i,
    (SELECT
     	open_branch_id "id",
     	MAX(avail_balance) "max"
     FROM
     	account
     GROUP BY
    	open_branch_id) a2
WHERE
	a.avail_balance = a2.max
    AND
    a.open_branch_id = a2.id
    AND
    a.open_branch_id = br.branch_id
    AND
    a.cust_id = c.cust_id
    AND
    c.cust_id = i.cust_id
UNION
SELECT
	a.account_id,
    b.name,
    br.name
FROM
	branch br,
    account a, 
    customer c,
    business b,
    (SELECT
     	open_branch_id "id",
     	MAX(avail_balance) "max"
     FROM
     	account
     GROUP BY
    	open_branch_id) a2
WHERE
	a.avail_balance = a2.max
    AND
    a.open_branch_id = a2.id
    AND
    a.open_branch_id = br.branch_id
    AND
    a.cust_id = c.cust_id
    AND
    c.cust_id = b.cust_id


/* 5. Visualização */

CREATE VIEW clients as
SELECT
	b.name "Cliente"
FROM
	business b,
    account a,
    branch br,
    customer c
WHERE
	br.branch_id = a.open_branch_id
    AND
    a.cust_id = c.cust_id
    AND
    c.cust_id = b.cust_id
    AND
    br.city != c.city
UNION
SELECT
	CONCAT(i.fname, " ", i.lname)
FROM
	individual i,
    account a,
    branch br,
    customer c
WHERE
	br.branch_id = a.open_branch_id
    AND
    a.cust_id = c.cust_id
    AND
    c.cust_id = i.cust_id
    AND
    br.city != c.city;

# Questão 2:
SELECT * from clients;

# Questão 4:

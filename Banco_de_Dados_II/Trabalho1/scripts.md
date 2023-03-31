## 1. Junções Internas

~~~SQL
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
~~~

### Resultado:

Administrador 	 |  Empresa 	          | Cidade
:------------:	 |:----------------------:|:--------:
John Chilton  	 | Chilton Engineering    | Salem
Paul Hardy    	 | Northeast Cooling Inc. | Wilmington
Carl Lutz     	 | Superior Auto Body     | Salem
Stanley Cheswick | AAA Insurance Inc.     | Quincy



## 2. Junções Internas, Uniões e Seleções
 
~~~SQL
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
~~~

### Resultado:

Cliente
:------:
Northeast Cooling Inc.
Richard Farley
James Hadley
Margaret Young

## 3. Junção Externa, Agrupamento, Agregação e Ordenação

~~~sql
SELECT
	CONCAT(e.fname, " ", e.lname) "Funcionário",
    YEAR(a.open_date) "Ano",
    COUNT(*) "Qtd. de Transações"
FROM
    employee e,
	account a
WHERE
	a.open_emp_id = e.emp_id
GROUP BY
	Funcionário, Ano
ORDER BY
	e.fname, e.start_date, a.open_date;
~~~

### Resultado:

Funcionário    	 | Qtd. de Transações |  Ano 
:----------------|:-------------------|:-----
John Blake     	 | 2                  | 2002 
John Blake     	 | 1                  | 2004 
Michael Smith    | 1                  | 2000 
Michael Smith    | 1                  | 2002 
Michael Smith    | 2                  | 2003 
Michael Smith    | 4                  | 2004 
Paula Roberts    | 2                  | 2000 
Paula Roberts    | 2                  | 2002 
Paula Roberts    | 3                  | 2004 
Theresa Markham  | 2                  | 2001 
Theresa Markham  | 2                  | 2002 
Theresa Markham  | 1                  | 2003 
Theresa Markham  | 1                  | 2004 




## 4. Junções Internas, Agrupamento, Agregação, União e Concatenação

~~~SQL
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
    c.cust_id = b.cust_id;
~~~

### Resultado:

ID da Conta |  Cliente 	             | Agência
:----------:|:----------------------:|:--------:
15 	    | John Spencer           | Headquarters
27   	    | Northeast Cooling Inc. | Woburn Branch
29     	    | Superior Auto Body     | So. NH Branch
28          | AAA Insurance Inc.     | Quincy Branch

## 5. Visualização

~~~SQL
CREATE VIEW clients AS
SELECT
    CONCAT(i.fname, " ", i.lname) "Cliente",
    i.cust_id "IdCliente",
    a.account_id "IdConta",
    br.branch_id "IdAgencia",
    a.avail_balance "Saldo",
    c.city "Cidade"
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
union
SELECT
    b.name,
    b.cust_id,
    a.account_id,
    br.branch_id,
    a.avail_balance,
    c.city
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
    c.cust_id = b.cust_id;
~~~


### Código para a questão 2:

~~~SQL
SELECT DISTINCT
    Cliente
FROM
    clients cl,
    branch br
WHERE
	cl.IdAgencia = br.branch_id
    AND
    cl.Cidade != br.city;
~~~

### Código para a questão 4:

~~~SQL

~~~

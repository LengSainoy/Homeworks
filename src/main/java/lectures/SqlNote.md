# SQL

a language use to manipulate db. it is the most popular Relational Data Base Management System (RDBM) language.
data are come in the from of table.

## Type of language

* DDL – Data Definition Language.
* DQL – Data Query Language.
* DML – Data Manipulation Language.
* DCL – Data Control Language.
* TCL – Transaction Control Language.

## SELECT

select columns by name , or use wildcard `*`
- SELECT DISTINCT to select only distinctive data


### FROM

table name

## AS

give alias to column or table name

### WHERE

The `WHERE` clause is used to filter records.
It is used to extract only those records that fulfill a specified condition.

#### Operator in where cause

- `=`, `>`, `<`, `>=`, `<=`, `<>`
- BETWEEN
- LIKE
- IN
- AND, OR, NOT
- how to test NULL values by using `IS NULL` or `IS NOT NULL`

### ORDER BY
use to order the display data by column name
- append `DESC` to reverse order

### AGGREGATE FUNCTION

- MIN
- MAX
- AVG
- COUNT

### GROUP BY

The `GROUP BY` statement groups rows that have the same values into summary rows, like "find the number of customers in
each country".
The `GROUP BY` statement is often used with aggregate functions (COUNT(), MAX(), MIN(), SUM(), AVG()) to group the
result-set by one or more columns.

### HAVING
The HAVING clause was added to SQL because the WHERE keyword cannot be used with aggregate functions.
only can be use with aggregate [function]()

## JOIN
- INNER JOIN
- LEFT (OUTER) JOIN
- RIGHT (OUTER) JOIN
- SELF JOIN

## UNION
The UNION operator is used to combine the result-set of two or more SELECT statements.

* Every SELECT statement within UNION must have the same number of columns
* The columns must also have similar data types
* The columns in every SELECT statement must also be in the same order
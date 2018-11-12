#read option
echo "*** Table name is :: $1 "

sqoop import  \
--connect jdbc:mysql://localhost:3306/classicmodels?zeroDateTimeBehavior=CONVERT_TO_NULL \
--username root \
--password root \
--table $1 \
--delete-target-dir \
--target-dir "/classicmodels/$1" \
--as-textfile \
-m 1 \
--enclosed-by '"' \
--fields-terminated-by "," \
--mysql-delimiters \

customers,employees, offices  , orderdetails        ,orders   , payments ,productlines,products

sh sqoop_dump_table.sh customers &
sh sqoop_dump_table.sh employees &
sh sqoop_dump_table.sh offices &
sh sqoop_dump_table.sh orderdetails &
sh sqoop_dump_table.sh orders &
sh sqoop_dump_table.sh payments &
sh sqoop_dump_table.sh productlines &
sh sqoop_dump_table.sh products &

Please Check ResourceManager WEB UI for the job progress


hdfs dfs -cat /classicmodels/customers/*
hdfs dfs -cat /classicmodels/employees/*
hdfs dfs -cat /classicmodels/offices/*
hdfs dfs -cat /classicmodels/orderdetails/*
hdfs dfs -cat /classicmodels/orders/*
hdfs dfs -cat /classicmodels/payments/*
hdfs dfs -cat /classicmodels/productlines/*
hdfs dfs -cat /classicmodels/products/*



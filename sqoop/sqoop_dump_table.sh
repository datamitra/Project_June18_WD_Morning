#file location $HOME/project/sqoop/sqoop_create_hive_table.sh
#Provide argument as the table that need to be imported.
#Error if table already exists
. /$HOME/notes/project/conf/mysql.properties

echo username - $mysql_user
echo database name - $mysql_dbname


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

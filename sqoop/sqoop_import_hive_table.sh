#file location $HOME/project/sqoop/sqoop_create_hive_table.sh
#Provide argument as the table that need to be imported.
#Error if table already exists
. /$HOME/notes/project/conf/mysql.properties

echo username - $mysql_user
echo database name - $mysql_dbname

echo "Table name passed is:: $1"
sqoop import  \
--connect jdbc:mysql://localhost:3306/$mysql_dbname?zeroDateTimeBehavior=CONVERT_TO_NULL \
--username $mysql_user \
--password $mysql_password \
--hive-import \
--hive-database hdpdlake \
--hive-overwrite \
--table $1 \
--delete-target-dir \
-m 1
#--map-column-hive image=String \

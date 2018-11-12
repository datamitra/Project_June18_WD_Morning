#file location $HOME/project/sqoop/sqoop_create_hive_table.sh
#Provide argument as the table that need to be imported.
#Error if table already exists
#--map-column-hive image=String \
 echo "start sqoop_create_hive_table.sh"
 echo "USAGE  -- scriptname  mysqltablename hivedatabasename"

#create database hdp_datalake;
#create database stg_datalake;
# data base name hdp_datalake,stg_datalake
# sh sqoop_create_hive_table.sh customers hdp_datalake
# sh sqoop_create_hive_table.sh employees hdp_datalake
#sh sqoop_create_hive_table.sh offices hdp_datalake
#sh sqoop_create_hive_table.sh orderdetails hdp_datalake
#sh sqoop_create_hive_table.sh orders hdp_datalake
#sh sqoop_create_hive_table.sh payments hdp_datalake
#sh sqoop_create_hive_table.sh productlines hdp_datalake
#sh sqoop_create_hive_table.sh products hdp_datalake

 
     . ../conf/mysql.properties
     . ../conf/hive.properties
     
      
     echo username -- $mysql_user
     echo database name -- $mysql_dbname
     echo stgdb -- $stgdb
     echo proddb -- $proddb
      
     echo "Table name passed is:: $1"
     echo "Hive database name:: $2 "
      
sqoop import  \
      --connect jdbc:mysql://localhost:3306/$mysql_dbname?zeroDateTimeBehavior=convertToNull \
      --username $mysql_user \
      --password $mysql_password \
--hive-delims-replacement "," \
      --hive-import \
      --create-hive-table \
      --hive-database $2 \
      --hive-overwrite \
      --table $1 \
      --delete-target-dir \
      -m 1

resultCode=$?
echo "Resut is :::::: $resultCode"
echo $resultCode

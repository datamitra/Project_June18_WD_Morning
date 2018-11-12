// ORM class for table 'orderdetails'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Nov 12 09:27:37 IST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class orderdetails extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer orderNumber;
  public Integer get_orderNumber() {
    return orderNumber;
  }
  public void set_orderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }
  public orderdetails with_orderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }
  private String productCode;
  public String get_productCode() {
    return productCode;
  }
  public void set_productCode(String productCode) {
    this.productCode = productCode;
  }
  public orderdetails with_productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }
  private Integer quantityOrdered;
  public Integer get_quantityOrdered() {
    return quantityOrdered;
  }
  public void set_quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }
  public orderdetails with_quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }
  private java.math.BigDecimal priceEach;
  public java.math.BigDecimal get_priceEach() {
    return priceEach;
  }
  public void set_priceEach(java.math.BigDecimal priceEach) {
    this.priceEach = priceEach;
  }
  public orderdetails with_priceEach(java.math.BigDecimal priceEach) {
    this.priceEach = priceEach;
    return this;
  }
  private Integer orderLineNumber;
  public Integer get_orderLineNumber() {
    return orderLineNumber;
  }
  public void set_orderLineNumber(Integer orderLineNumber) {
    this.orderLineNumber = orderLineNumber;
  }
  public orderdetails with_orderLineNumber(Integer orderLineNumber) {
    this.orderLineNumber = orderLineNumber;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orderdetails)) {
      return false;
    }
    orderdetails that = (orderdetails) o;
    boolean equal = true;
    equal = equal && (this.orderNumber == null ? that.orderNumber == null : this.orderNumber.equals(that.orderNumber));
    equal = equal && (this.productCode == null ? that.productCode == null : this.productCode.equals(that.productCode));
    equal = equal && (this.quantityOrdered == null ? that.quantityOrdered == null : this.quantityOrdered.equals(that.quantityOrdered));
    equal = equal && (this.priceEach == null ? that.priceEach == null : this.priceEach.equals(that.priceEach));
    equal = equal && (this.orderLineNumber == null ? that.orderLineNumber == null : this.orderLineNumber.equals(that.orderLineNumber));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orderdetails)) {
      return false;
    }
    orderdetails that = (orderdetails) o;
    boolean equal = true;
    equal = equal && (this.orderNumber == null ? that.orderNumber == null : this.orderNumber.equals(that.orderNumber));
    equal = equal && (this.productCode == null ? that.productCode == null : this.productCode.equals(that.productCode));
    equal = equal && (this.quantityOrdered == null ? that.quantityOrdered == null : this.quantityOrdered.equals(that.quantityOrdered));
    equal = equal && (this.priceEach == null ? that.priceEach == null : this.priceEach.equals(that.priceEach));
    equal = equal && (this.orderLineNumber == null ? that.orderLineNumber == null : this.orderLineNumber.equals(that.orderLineNumber));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.orderNumber = JdbcWritableBridge.readInteger(1, __dbResults);
    this.productCode = JdbcWritableBridge.readString(2, __dbResults);
    this.quantityOrdered = JdbcWritableBridge.readInteger(3, __dbResults);
    this.priceEach = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.orderLineNumber = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.orderNumber = JdbcWritableBridge.readInteger(1, __dbResults);
    this.productCode = JdbcWritableBridge.readString(2, __dbResults);
    this.quantityOrdered = JdbcWritableBridge.readInteger(3, __dbResults);
    this.priceEach = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.orderLineNumber = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(orderNumber, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(productCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(quantityOrdered, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(priceEach, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(orderLineNumber, 5 + __off, 5, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(orderNumber, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(productCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(quantityOrdered, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(priceEach, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(orderLineNumber, 5 + __off, 5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.orderNumber = null;
    } else {
    this.orderNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.productCode = null;
    } else {
    this.productCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.quantityOrdered = null;
    } else {
    this.quantityOrdered = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.priceEach = null;
    } else {
    this.priceEach = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.orderLineNumber = null;
    } else {
    this.orderLineNumber = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.orderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.orderNumber);
    }
    if (null == this.productCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productCode);
    }
    if (null == this.quantityOrdered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quantityOrdered);
    }
    if (null == this.priceEach) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.priceEach, __dataOut);
    }
    if (null == this.orderLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.orderLineNumber);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.orderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.orderNumber);
    }
    if (null == this.productCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productCode);
    }
    if (null == this.quantityOrdered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quantityOrdered);
    }
    if (null == this.priceEach) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.priceEach, __dataOut);
    }
    if (null == this.orderLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.orderLineNumber);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(orderNumber==null?"null":"" + orderNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ',' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(productCode==null?"null":productCode, ",", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantityOrdered==null?"null":"" + quantityOrdered, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(priceEach==null?"null":priceEach.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(orderLineNumber==null?"null":"" + orderLineNumber, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(orderNumber==null?"null":"" + orderNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ',' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(productCode==null?"null":productCode, ",", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantityOrdered==null?"null":"" + quantityOrdered, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(priceEach==null?"null":priceEach.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(orderLineNumber==null?"null":"" + orderLineNumber, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderNumber = null; } else {
      this.orderNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.productCode = null; } else {
      this.productCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantityOrdered = null; } else {
      this.quantityOrdered = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.priceEach = null; } else {
      this.priceEach = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderLineNumber = null; } else {
      this.orderLineNumber = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderNumber = null; } else {
      this.orderNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.productCode = null; } else {
      this.productCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantityOrdered = null; } else {
      this.quantityOrdered = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.priceEach = null; } else {
      this.priceEach = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderLineNumber = null; } else {
      this.orderLineNumber = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    orderdetails o = (orderdetails) super.clone();
    return o;
  }

  public void clone0(orderdetails o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("orderNumber", this.orderNumber);
    __sqoop$field_map.put("productCode", this.productCode);
    __sqoop$field_map.put("quantityOrdered", this.quantityOrdered);
    __sqoop$field_map.put("priceEach", this.priceEach);
    __sqoop$field_map.put("orderLineNumber", this.orderLineNumber);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("orderNumber", this.orderNumber);
    __sqoop$field_map.put("productCode", this.productCode);
    __sqoop$field_map.put("quantityOrdered", this.quantityOrdered);
    __sqoop$field_map.put("priceEach", this.priceEach);
    __sqoop$field_map.put("orderLineNumber", this.orderLineNumber);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("orderNumber".equals(__fieldName)) {
      this.orderNumber = (Integer) __fieldVal;
    }
    else    if ("productCode".equals(__fieldName)) {
      this.productCode = (String) __fieldVal;
    }
    else    if ("quantityOrdered".equals(__fieldName)) {
      this.quantityOrdered = (Integer) __fieldVal;
    }
    else    if ("priceEach".equals(__fieldName)) {
      this.priceEach = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("orderLineNumber".equals(__fieldName)) {
      this.orderLineNumber = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("orderNumber".equals(__fieldName)) {
      this.orderNumber = (Integer) __fieldVal;
      return true;
    }
    else    if ("productCode".equals(__fieldName)) {
      this.productCode = (String) __fieldVal;
      return true;
    }
    else    if ("quantityOrdered".equals(__fieldName)) {
      this.quantityOrdered = (Integer) __fieldVal;
      return true;
    }
    else    if ("priceEach".equals(__fieldName)) {
      this.priceEach = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("orderLineNumber".equals(__fieldName)) {
      this.orderLineNumber = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

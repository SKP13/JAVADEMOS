package com.stackroute.datamunger.query.parser;

import java.util.List;
/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */

public class QueryParameter {
	private String FileName;
	private List<String> Fields;
	private List<Restriction> Restrictions;
	
	
	private String BaseQuery;
	private List<AggregateFunction> AggregateFunctions;
	private  List<String> LogicalOperators;
	private  List<String> GroupByFields;
	private List<String> OrderByFields;
	private String QUERY_TYPE;
	public QueryParameter() {
		
	}
	public QueryParameter(String fileName, List<String> fields, List<Restriction> restrictions, String baseQuery,
			List<com.stackroute.datamunger.query.parser.AggregateFunction> aggregateFunctions,
			List<String> logicalOperators, List<String> groupByFields, List<String> orderByFields, String qUERY_TYPE) {
		super();
		FileName = fileName;
		Fields = fields;
		Restrictions = restrictions;
		BaseQuery = baseQuery;
		AggregateFunctions = aggregateFunctions;
		LogicalOperators = logicalOperators;
		GroupByFields = groupByFields;
		OrderByFields = orderByFields;
		QUERY_TYPE = qUERY_TYPE;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public List<String> getFields() {
		return Fields;
	}
	public void setFields(List<String> fields) {
		Fields = fields;
	}
	public List<Restriction> getRestrictions() {
		return Restrictions;
	}
	public void setRestrictions(List<Restriction> restrictions) {
		Restrictions = restrictions;
	}
	public String getBaseQuery() {
		return BaseQuery;
	}
	public void setBaseQuery(String baseQuery) {
		BaseQuery = baseQuery;
	}
	public List<AggregateFunction> getAggregateFunctions() {
		return AggregateFunctions;
	}
	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		AggregateFunctions = aggregateFunctions;
	}
	public List<String> getLogicalOperators() {
		return LogicalOperators;
	}
	public void setLogicalOperators(List<String> logicalOperator) {
		LogicalOperators = logicalOperator;
	}
	public List<String> getGroupByFields() {
		return GroupByFields;
	}
	public void setGroupByFields(List<String> groupByFields) {
		GroupByFields = groupByFields;
	}
	public List<String> getOrderByFields() {
		return OrderByFields;
	}
	public void setOrderByFields(List<String> orderByFields) {
		OrderByFields = orderByFields;
	}
	public String getQUERY_TYPE() {
		return QUERY_TYPE;
	}
	public void setQUERY_TYPE(String QUERY_TYPE) {
		this.QUERY_TYPE = QUERY_TYPE;
	}
	

	
		

	
}

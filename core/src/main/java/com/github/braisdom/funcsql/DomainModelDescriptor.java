package com.github.braisdom.funcsql;

import com.github.braisdom.funcsql.annotations.PrimaryKey;
import com.github.braisdom.funcsql.transition.ColumnTransitional;

public interface DomainModelDescriptor<T> {

    T newInstance();

    String getTableName();

    PrimaryKey getPrimaryKey();

    Object getPrimaryValue(T domainObject);

    boolean skipNullOnUpdate();

    Class getDomainModelClass();

    DomainModelDescriptor getRelatedModeDescriptor(Class relatedClass);

    String[] getColumns();

    String[] getInsertableColumns();

    String[] getUpdatableColumns();

    String getColumnName(String fieldName);

    String getFieldName(String columnName);

    Class getFieldType(String fieldName);

    Object getValue(T modelObject, String fieldName);

    void setValue(T modelObject, String fieldName, Object fieldValue);

    ColumnTransitional getColumnTransition(String fieldName);
}

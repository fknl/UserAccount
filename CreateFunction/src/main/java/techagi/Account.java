package techagi;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="AccountTable")
public class Account {

    @DynamoDBHashKey(attributeName = "Username")
    @DynamoDBAttribute(attributeName = "Username")
    private String username;
    @DynamoDBRangeKey
    @DynamoDBAttribute(attributeName = "Name")
    private String name;
    @DynamoDBAttribute(attributeName = "Surname")
    private String surname;

    public Account() {
    }

    public Account(String username, String name, String surname) {
        this.username = username;
        this.name = name;
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

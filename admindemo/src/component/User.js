import React from "react";
import {
    List,
    Datagrid,
    TextField,
    Edit,
    SimpleForm,
    EditButton,
    TextInput,
    NumberInput,

} from "react-admin";


export const listUser = (props) => (
    <List {...props}>
        <Datagrid style={{ overflowX: "auto" }}>
            <TextField source="id" />
            <TextField source="adress" />
            <TextField source="fullName" />
            <TextField source="photoUser" />
            <TextField source="password" />
            <TextField source="userName" />
            <EditButton />
        </Datagrid>
    </List>
);


export const editUser = (props) => {
    return (
        <Edit {...props}>
            <SimpleForm>
                <TextInput source="fullName" />
                <TextInput source="adress" />
                <TextInput source="photoUser" />
                <NumberInput source="phone" />
                <TextInput source="password" />
            </SimpleForm>
        </Edit>
    );

};



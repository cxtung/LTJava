import React, { useRef } from "react";
import {
    List,
    Datagrid,
    TextField,
    Edit,
    SimpleForm,
    EditButton,
    TextInput,
    NumberInput,
    Create,
    ReferenceInput,
    SelectInput,
    useNotify,
    useRedirect,
} from "react-admin";

export const listOrder = (props) => (
    <List {...props}>
        <Datagrid style={{ overflowX: "auto" }}>
            <TextField source="id" />
            <TextField source="user.userName" />
            <TextField source="status" />
            <EditButton />
        </Datagrid>
    </List>
);

export const editOrder = (props) => {
    return (
        <Edit {...props}>
            <SimpleForm>

            </SimpleForm>
        </Edit>
    );

};
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

export const listOrder_Detail = (props) => (
    <List {...props}>
        <Datagrid style={{ overflowX: "auto" }}>
            <TextField source="id" />
            <TextField source="quantity" />
            <TextField source="price" />
            <TextField source="order.user.userName" />
            <EditButton />
        </Datagrid>
    </List>
);
export const editOrder_Detail = (props) => {
    return (
        <Edit {...props}>
            <SimpleForm>

            </SimpleForm>
        </Edit>
    );

};
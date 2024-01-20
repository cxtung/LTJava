import React from "react";
import { Admin, Resource } from "react-admin";
import AdminPanel from "./component/AdminPanel";
import {
  listCategory,
  editCategory,
  createCategory,
} from "./component/Category";

import { listProduct, editProduct, CreateProduct } from "./component/Products";
import { listUser, editUser, } from "./component/User";
import { listOrder, editOrder } from "./component/Orders";
import { listOrder_Detail, editOrder_Detail } from "./component/Order_Detail";

import dataProvider from "./component/customDataProvider";

const App = () => (
  <Admin dashboard={AdminPanel} dataProvider={dataProvider}>
    <Resource
      name="categories"
      list={listCategory}
      edit={editCategory}
      create={createCategory}
    />
    <Resource
      name="products"
      list={listProduct}
      edit={editProduct}
      create={CreateProduct}
    />
    <Resource
      name="users"
      list={listUser}
      edit={editUser}
    />
    <Resource
      name="orders"
      list={listOrder}
      edit={editOrder}

    />
    <Resource
      name="order_details"
      list={listOrder_Detail}
      edit={editOrder_Detail}

    />
  </Admin>
);

export default App;

# Métricas

## Controladores
<details><summary><b> Mostrar </b></summary>
</br>

Métricas de la clase `BillController` de Java.

| Métrica                 | Valor                                                                                                   |
|------------------------|---------------------------------------------------------------------------------------------------------|
| Complejidad ciclomática | 1                                                                                                       |
| Número de líneas de código | 10                                                                                                 |
| Número de métodos       | 1                                                                                                       |
| Número de atributos     | 0                                                                                                       |
| Cantidad de parámetros por método | 5 (quantity1, quantity2, quantity3, quantity4, quantity5)                                           |
| Total de líneas de la clase | 10                                                                                                  |
| Nombre de cada método    | createBillList(int quantity1, int quantity2, int quantity3, int quantity4, int quantity5)              |
| Total de líneas por método | 7                                                                                                     |

</br>

Métricas de la clase `CoinController` de Java.

| Métrica                 | Valor                                                                                                   |
|------------------------|---------------------------------------------------------------------------------------------------------|
| Complejidad ciclomática | 1                                                                                                       |
| Número de líneas de código | 9                                                                                                  |
| Número de métodos       | 1                                                                                                       |
| Número de atributos     | 0                                                                                                       |
| Cantidad de parámetros por método | 3 (quantity1, quantity2, quantity3)                                                                     |
| Total de líneas de la clase | 9                                                                                                       |
| Nombre de cada método    | createCoinList(int quantity1, int quantity2, int quantity3)                                             |
| Total de líneas por método | 6                                                                                                       |

</br>

Métricas de la clase `ProductController` de Java.

| Métrica                 | Valor                                                                                                   |
|------------------------|---------------------------------------------------------------------------------------------------------|
| Complejidad ciclomática | 1                                                                                                       |
| Número de líneas de código | 9                                                                                                  |
| Número de métodos       | 1                                                                                                       |
| Número de atributos     | 0                                                                                                       |
| Cantidad de parámetros por método | 0                                                                                                       |
| Total de líneas de la clase | 9                                                                                                       |
| Nombre de cada método    | createProductList()                                                                                    |
| Total de líneas por método | 5                                                                                                       |

</details>

</br>

## Modelos

<details><summary><b> Mostrar </b></summary>

Métricas de la clase `BillModel` de Java.

| Métrica                 | Valor                                                                                                   |
|------------------------|---------------------------------------------------------------------------------------------------------|
| Complejidad ciclomática | 1                                                                                                       |
| Número de líneas de código | 3                                                                                                       |
| Número de métodos       | 1                                                                                                       |
| Número de atributos     | 2                                                                                                       |
| Cantidad de parámetros por método | 2                                                                                                       |
| Total de líneas de la clase | 3                                                                                                       |
| Nombre de cada método    | Constructor BillModel(double, int)                                                                      |
| Total de líneas por método | 1                                                                                                       |

</br>

Métricas de la clase `CoinModel` de Java.

| Métrica                 | Valor                                                                                                   |
|------------------------|---------------------------------------------------------------------------------------------------------|
| Complejidad ciclomática | 1                                                                                                       |
| Número de líneas de código | 3                                                                                                       |
| Número de métodos       | 1                                                                                                       |
| Número de atributos     | 2                                                                                                       |
| Cantidad de parámetros por método | 2                                                                                                       |
| Total de líneas de la clase | 3                                                                                                       |
| Nombre de cada método    | Constructor CoinModel(double, int)                                                                      |
| Total de líneas por método | 1                                                                                                       |

</br>

Métricas de la clase `MachineModel` de Java.

| Metrica | Cantidad |
|---------|----------|
| Atributos | 4 |
| Métodos | 7 |
| Parámetros por método | addBills: 1, addCoins: 1, addProducts: 1, showName: 0, listOfBills: 0, listOfCoins: 0, listOfProducts: 0 |
| Total de líneas de la clase | 17 |
| Total de líneas por método | addBills: 3, addCoins: 3, addProducts: 3, showName: 2, listOfBills: 2, listOfCoins: 2, listOfProducts: 2 |

### Detalle de métodos

| Método | Cantidad de líneas | Parámetros |
|--------|-------------------|------------|
| addBills(BillModel bill) | 3 | bill: BillModel |
| addCoins(CoinModel coin) | 3 | coin: CoinModel |
| addProducts(ProductModel product) | 3 | product: ProductModel |
| showName() | 2 | No recibe parámetros |
| listOfBills() | 2 | No recibe parámetros |
| listOfCoins() | 2 | No recibe parámetros |
| listOfProducts() | 2 | No recibe parámetros |

</br>

Métricas de la clase `MaintenanceModel` de Java.

**Atributos:**

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| name | String | Nombre de la tarea de mantenimiento |
| type | String | Tipo de tarea de mantenimiento (preventivo, correctivo, predictivo) |

**Métodos:**

| Método | Parámetros | Valor de retorno | Descripción |
|--------|------------|-----------------|-------------|
| MaintenanceModel() | String name, String type | N/A | Constructor que crea una nueva instancia de `MaintenanceModel` con los atributos `name` y `type` especificados |

</br>

Métricas de la clase `MoneyModel` de Java.

| Métricas      | Cantidad |
| ----------- | ----------- |
| Atributos      | 2       |
| Métodos   | 3        |
| Parámetros por método | 1 (updatePrice), 1 (updateQuantity), 2 (constructor) |
| Líneas de código de la clase | 8 |
| Líneas de código del método updatePrice | 2 |
| Líneas de código del método updateQuantity | 2 |
| Líneas de código del constructor | 4 |

| Nombre del método | Parámetros | Líneas de código |
| ----------- | ----------- | ----------- |
| MoneyModel | double value, int quantity | 2 |
| updatePrice   | double value        | 1 |
| updateQuantity | int quantity       | 1 |

</br>

Métricas de la clase `ProductModel` de Java.

| Métrica | Valor |
|---------|-------|
| Atributos | 3 |
| Métodos | 3 |
| Total de parámetros por método | 1 |
| Total de líneas de la clase | 8 |
| Total de líneas por método | 3 |
| Nombre de los métodos | `updatePrice`, `updateName`, `updateQuantity` |

</br>

Métricas de la clase `PurchaseModel` de Java.

| Métricas        | Cantidad |
|-----------------|----------|
| Atributos        | 1        |
| Métodos         | 4         |
| Total de líneas | 49       |
| Parámetros por método: |          |
| purchase(MachineModel machine)       | 1 (machine) |
| calculateChange(double amountReceived, double amountProduct, MachineModel machine) | 3 (amountReceived, amountProduct, machine) |
| showProductSelection(List<ProductModel> products) | 1 (products) |
| selectProduct(List<ProductModel> products) | 1 (products) |
| Total de líneas de cada método: |          |
| purchase(MachineModel machine)        | 26       |
| calculateChange(double amountReceived, double amountProduct, MachineModel machine) | 13       |
| showProductSelection(List<ProductModel> products) | 10       |
| selectProduct(List<ProductModel> products) | 4        |

| Nombre del método | Cantidad de líneas | Parámetros |
|-------------------|--------------------|--------------|
| purchase(MachineModel machine) | 26 | MachineModel machine |
| calculateChange(double amountReceived, double amountProduct, MachineModel machine) | 13 | double amountReceived, double amountProduct, MachineModel machine |
| showProductSelection(List<ProductModel> products) | 10 | List<ProductModel> products |
| selectProduct(List<ProductModel> products) | 4 | List<ProductModel> products |

</details>

</br>

## Vistas

<details><summary><b> Mostrar </b></summary>

Métricas de la clase `MachineView` de Java.

| Métrica                   | Valor       |
|---------------------------|-------------|
| Cantidad de atributos      | 1           |
| Cantidad de métodos       | 2           |
| Total de líneas de la clase | 33         |
| Cantidad de parámetros por método | 1     |
| Total de líneas del método `printMachineName` | 8 |
| Total de líneas del método `machineSelection` | 19 |
| Nombre del método         | printMachineName |
| Nombre del método         | machineSelection |

</br>

Métricas de la clase `ProductView` de Java.

| Métrica                 | Valor                           |
|------------------------|---------------------------------|
| Número de métodos       | 1                               |
| Número de atributos     | 0                               |
| Total de líneas         | 16                              |
| Parámetros por método   | 1                               |
| Total de líneas por método | 13                           |
| Nombre de cada método   | printProducts(List<MachineModel> machines) |

</br>

Métricas de la clase `PurchaseView` de Java.

| Métricas                   | PurchaseView              |
|--------------------------|---------------------------|
| Cantidad de métodos       | 3                         |
| Cantidad de atributos     | 1 (input)                 |
| Cantidad de líneas de código | 38                      |
| Cantidad de parámetros por método |                          |
|   purchaseMenu            | 1 (List<MachineModel> machines) |
|   generateChangeMessage   | 3 (double amount, List<BillModel> bills, List<CoinModel> coins) |
|   printTicket             | 2 (ProductModel product, String messageChange) |
| Cantidad de líneas por método |                              |
|   purchaseMenu            | 16                           |
|   generateChangeMessage   | 22                           |
|   printTicket             | 9                            |
| Nombre de cada método     | purchaseMenu, generateChangeMessage, printTicket |

</details>

</br>

## Main

<details><summary><b> Mostrar </b></summary>

| Métrica           | Cantidad |
|-------------------|----------|
| Atributos         | 0        |
| Métodos           | 1        |
| Total de líneas   | 23       |
| Parámetros por método | 1 (en el método main) |
| Líneas por método | 23 (en el método main) |
| Nombre del método | main     |

</details>

</br>

# _Note_ : This is reimplementation of [This Project](https://github.com/neelpatel05/periodic-table-api) using java spring-boot.

# periodic_table_apis
This is a small java springboot backend application which provides apis for periodic table.

## Overview
The following document will specify how to use the API to fetch the periodic elements in JSON. Also it will state different methods throught which the elements can be fetch.

|     **Data Object**    |
|------------------------|
| symbol                 |
| name                   |
| atomicMass             |
| atomicNumber           |
| atomicRadius           |
| boilingPoint           |
| bondingType            |
| cpkHexColor            |
| density                |
| electronAffinity       |
| electronegativity      |
| electronicConfiguration|
| groupBlock             |
| ionRadius              |
| ionizationEnergy       |
| meltingPoint           |
| oxidationStates        |
| standardState          |
| vanDerWaalsRadius      |
| yearDiscovered         |


## Methods

### All

- "/" i.e-at base url

This will fetch all the 118 elements from periodic table.

### Atomic Number

- "/atomicNumber/20"

This will fetch element from periodic table having atomic number 20. Replace 20 with any other atomic number to fetch that element from 118.

### Atomic Name

- "/atomicName/Mercury"

This will fetch element from periodic table having atomic name "Mercury". Replace "Mercury" with any other atomic name to fetch that element.

### Atomic Symbol

- "/symbol/H"

This will fetch element from periodic table having atomic symbol "H" i.e. Hydrogen. Replace "H" with any other atomic symbol to fetch that element.

### Bonding Type

- "/bondingType/metallic"

This will fetch all elements from periodic table having  Metallic bonding. Replace metallic with any other bonding type to fetch elements.

### Group Block

- "/atomicGroup/metal"

This will fetch all elements from periodic table belongs to metal group. Replace metal with any other bonding type to fetch elements.

### State

- "/atomicState/gas"

This will fetch all elements from periodic table belongs to gas state. Replace gas with any other state to fetch elements.

## There are two post methods to add new elements one to add single element and other to add multiple elements at once.

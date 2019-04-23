This is an algorithm for the final project.

# GOAL
* Create an inventory program for the meat department
* Use OOP principles

# INPUT
NOTE: These are actions that can be taken from user.

* Choose item by code
* Choose whether to return meat to or take out from inventory.
* Choose whether meat is primal or trim.
* Record weight.
* Choose an output file.
* Cancel a transaction


# OUTPUT
NOTE: These are outputs based on user input of each menu

* File output of current inventory.
* File output of transactions made.

# STEPS (MAIN.JAVA)
1. Initialize array of primals. 
2. Welcoming message for user along with prompting for option number
3. IF: Which option

        1) Enter meat into inventory
        2) Cancel a transaction
        3) Output a File
        4) Exit (saves progress automatically)
---
# MEATPACKAGE
## PRIMAL.JAVA
NOTE: This is an abstract function.

### PRIMAL()
**GOAL**: Create objects of meats used in inventory.

**INPUT**: None.
	
**OUTPUT**: None.

**STEPS**:
	
  1. Initialize all respective private members.

### ADDWEIGHT()
**GOAL**: Add weight to weightInv, the weight of primal in inventory

**INPUT**: double weight.
	
**OUTPUT**: None.

**STEPS**:
	
  1. Increase this.weightInv by input weight.

### SUBTRACTWEIGHT()
**GOAL**: Subtract weight from weightInv, the weight of primal in inventory

**INPUT**: double weight.
	
**OUTPUT**: None.

**STEPS**:
	
  1. Decrease this.weightInv by input weight.

### GETWEIGHT()
**GOAL**: Get weightInv, the weight of primal in inventory

**INPUT**: None.
	
**OUTPUT**: double weightInv.

**STEPS**:
	
  1. Return this.weightInv.

### IFGRASSFED()
**GOAL**: Return a boolean indicator indciating if meat is grass fed or not.

**INPUT**: None.
	
**OUTPUT**: boolean true/false.

**STEPS**:
	
  1. Return true if meat is grass fed.
  
  2. Return false if otherwise.
  
### GETNAME()
**GOAL**: Get name, the official name of primal

**INPUT**: None.
	
**OUTPUT**: String name.

**STEPS**:
	
  1. Return this.name
  
### GETITEMCODE()
**GOAL**: Get code number, the input into the machine to get said primal

**INPUT**: None.
	
**OUTPUT**: int code.

**STEPS**:
	
  1. Return this.code 
  
### ListPrimal()
**GOAL**: Print primal information to system

**INPUT**: None.
	
**OUTPUT**: none.

**STEPS**:
	
  1. Print in the following order
          
          1) code
          2) name
          3) weightInv
          4) type
          5) Price item is sold at per lb.

### WritePrimal()
**GOAL**: Print primal information to file

**INPUT**: None.
	
**OUTPUT**: none.

**STEPS**:
	
  1. Print in the following order
          
          1) code
          2) name
          3) weightInv
          4) type
          5) Price item is sold at per lb.

### GetNeedTrim()
**GOAL**: Tell user whether trim is used for the product or not

**INPUT**: None.
	
**OUTPUT**: boolean needTrim.

**STEPS**:
	
  1. Return this.needTrim
  
## GENERICMEAT.JAVA
NOTE: Most meat follow this function, as such this is a generic description for all meats in meatpackage

### GENERICMEAT()
**GOAL**: Create object

**INPUT**: None.
	
**OUTPUT**: none.

**STEPS**:
	
  1. Initialize all private members as such
---
# TRANSPACKAGE
NOTE: This is for all TRANSACTION related functions

## TransClass.JAVA
### TransClass(Primal meat, double weight, boolean addTrue, int id) 
**GOAL**: Initialize type of transaction

**INPUT**: Primal meat, double weight, boolean addTrue, int id
	
**OUTPUT**: None.

**STEPS**:
	
  1. Initialize type of primal
  
  2. Initialize amount of weight being transferred
  
  3. Initialize whether primal is being placed back in inventory or not
  
  4. Initialize Transaction ID #.
  
### ListTrans() 
**GOAL**: Print primal information to system

**INPUT**: None.
	
**OUTPUT**: None.

**STEPS**:

  1. Print in the following order
          
          1) item code # 
          2) transaction id #
          3) name of primal
          4) weight being moved
          5) date of transaction

### WriteTrans() 
**GOAL**: Print primal information to file HistoryTrans.txt

**INPUT**: None.
	
**OUTPUT**: None.

**STEPS**:

  1. Print in the following order
          
          1) item code # 
          2) transaction id #
          3) name of primal
          4) weight being moved
          5) date of transaction
          
  2. Append onto pre-existing info
  
### GetEnterRemove() 
**GOAL**: Let user know if item is being moved into or out of inventory

**INPUT**: None.
	
**OUTPUT**: boolean addTrue.

**STEPS**:

  1. Return this.addTrue

### GetID() 
**GOAL**: Let user know transaction id number

**INPUT**: None.
	
**OUTPUT**: boolean addTrue.

**STEPS**:

  1. return this.id

### GetItemCode() 
**GOAL**: Let user know item code #

**INPUT**: None.
	
**OUTPUT**: int code.

**STEPS**:

  1. return code #
  
### GetWeight() 
**GOAL**: Let user know weight being added or subtracted

**INPUT**: None.
	
**OUTPUT**: double weight.

**STEPS**:

  1. return weight
---
# MENUPACKAGE
NOTE: This is for all user-interaction related functions

## MainMenu.JAVA
### UserSerial(ArrayList<Primal> arrayP, ArrayList<TransClass> arrayT, WeightMenu weightmenu) 

**GOAL**: Deserialize arrayP and arrayT from files

**INPUT**: ArrayList<Primal> arrayP, ArrayList<TransClass> arrayT, WeightMenu weightmenu
	
**OUTPUT**: None.

**STEPS**:
	
  1. Ask if user wants to load system
  
  2. IF: Deserialize
  
  3. Open "SavedArrayP" and "SavedArrayT" and load them into arrayP and arrayT respectively.
  
### GetOption(int min, int max) 

**GOAL**: Prompt user for specific responses

**INPUT**: int min and max
	
**OUTPUT**: int numCheck.

**STEPS**:
	
  1. TRYCATCH to prompt user a number between "min" and "max"
  
  2. IF: Between numbers, return int numCheck. Otherwise, keep prompting for a resonse.
  
### EnterIntoInventory(ArrayList<Primal> arrayP, ArrayList<TransClass> arrayT, WeightMenu weightmenu, int id) 

**GOAL**: Prompt user for weight

**INPUT**: ArrayList<Primal> arrayP, ArrayList<TransClass> arrayT, WeightMenu weightmenu, int id
	
**OUTPUT**: none.

**STEPS**:
	
  1. Prompt for item code. Proceed if found in arrayP, stop system if not found.
  
  2. Get user to validate response
  
  3. Determine if primal or trim being entered into the inventory
  
  4. Determine if being taken from or added back into inventory
  
  5. If successful, record transaction inot arrayT. If not, cancel entire transaction.

## OutputFile.JAVA
### DoOption(int option, ArrayList<TransClass> arrayT, ArrayList<Primal> arrayP) 

**GOAL**: Determine which file is to be printed

**INPUT**: int option, ArrayList<TransClass> arrayT, ArrayList<Primal> arrayP
	
**OUTPUT**: None.

**STEPS**:

IF 1:
  1. Write arrayP into "CurrentInv.txt"
    
    a) Also display on screen 

IF 2:
  2. Write arrayT into "HistoryTrans.txt"
  
    a) Also display on screen 

IF 3:
  3. Exit system

## WeightMenu.JAVA
### GetItemCode()

**GOAL**: Get Number code from user

**INPUT**: none.
	
**OUTPUT**: int code.

**STEPS**:

  1. Prompt user for item code.
  
### GetTransID()

**GOAL**: Get transaction ID from user

**INPUT**: none.
	
**OUTPUT**: int transID.

**STEPS**:

  1. Prompt user for item code.

### GetPrimalTrim()

**GOAL**: Get whether item is trim or primal from user

**INPUT**: none.
	
**OUTPUT**: boolean response.

**STEPS**:

  1. Yes for primal, no for trim

### GetEnterRemove()

**GOAL**: Get whether item being entered or removed from user

**INPUT**: none.
	
**OUTPUT**: boolean response.

**STEPS**:

  1. Yes for into inventory, no for moving out

### GetWeight()

**GOAL**: Get weight from user

**INPUT**: none.
	
**OUTPUT**: double weight.

**STEPS**:

  1. Prompt for weight.
  
### Validate(String strInput)

**GOAL**: Ask user if input was okay

**INPUT**: String strInput.
	
**OUTPUT**: boolean.

**STEPS**:

  1. Ask for a y/n.
  
  2. True for 'y', and no for 'n'
  



# Intermediate JPA Lab(3.06)
## Specifications

1. Using Spring JPA model the relationships of the below application:

   Assume that you are working with a Task Management software. Below are the requirements in regards to data storage:

   - Tasks have a title, dueDate, and a boolean status
   - There are 2 kinds of tasks BillableTask and InternalTask. BillableTask have an hourlyRate

2. Using Spring JPA model the relationships of the below application:

   Assume that you are working with a PR company to model their data. Below are the requirements in regards to data storage:

   - The database consists of Contacts. Each Contact has a Name, title, and company.
   - Names are their own object and have a firstName, lastName, middleName, and salutation.
   - Names should not be stored in a separate table in the database.

3. List 3 tasks that can be accomplished with native SQL that you cannot do with JPQL
- With JPQL you can update and delete any fields.
- Also you can order by any data type.

1. Buatlah test case dan test scenario untuk fitur sign up dan pembelian barang pada aplikasi berikut https://www.demoblaze.com/index.html
Buatlah test case dan test scenario dengan menggunakan tools yang menggunakan artificial intelligence.


Based on the website "https://www.demoblaze.com/index.html", here is a proposed test case and test scenario for the Sign Up and Purchase features:

### Test Scenario 1: User Registration
**Objective**: To ensure that users can successfully sign up for a new account.

**Test Cases**:
1. **Valid Sign Up**:
   - **Preconditions**: User is at the homepage.
   - **Steps**:
     1. Navigate to the "Sign up" link and click it.
     2. Enter a valid username and password.
     3. Submit the form.
   - **Expected Result**: User is registered and receives a confirmation message.

2. **Invalid Sign Up (Duplicate Username)**:
   - **Preconditions**: Username is already taken.
   - **Steps**:
     1. Navigate to the "Sign up" link and click it.
     2. Enter an existing username and a password.
     3. Submit the form.
   - **Expected Result**: User sees an error message indicating the username is taken.

### Test Scenario 2: Purchase Product
**Objective**: To verify that registered users can purchase products.

**Test Cases**:
1. **Valid Purchase**:
   - **Preconditions**: User is logged in and items are in stock.
   - **Steps**:
     1. Log in with a valid username and password.
     2. Select a product from any category (e.g., Phones).
     3. Add the product to the cart.
     4. Navigate to the cart and proceed to checkout.
     5. Complete the purchase process.
   - **Expected Result**: Purchase is successful, and user receives a confirmation message.

2. **Invalid Purchase (Out of Stock)**:
   - **Preconditions**: The product is out of stock.
   - **Steps**:
     1. Log in and select an out-of-stock product.
     2. Attempt to add the product to the cart.
   - **Expected Result**: User is unable to add the product and sees an out-of-stock notification.

These test cases cover the basic functionality for new user registration and purchasing workflow on the Demo Blaze website, ensuring that the application behaves as expected under normal and exceptional conditions.

Link Aplitools : https://eyes.applitools.com/app/test-results/00000251687905768385?accountId=QOH5Wa_8ak2cOz8269bAJg__&display=details&top=00000251687904995147%282%29
https://eyes.applitools.com/app/test-results/00000251687904995147?accountId=QOH5Wa_8ak2cOz8269bAJg__&display=details&top=00000251687904995147%282%29

const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.post('/placeEmergencyOrder', (req, res) => {
    const { itemName, quantity, deliveryAddress } = req.body;

    // TODO: Process the order and communicate with the drone system

    res.json({ message: `Emergency order placed for ${quantity} ${itemName}(s). Delivering to ${deliveryAddress}.` });
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
    function placeEmergencyOrder() {
        const itemName = document.getElementById('itemName').value;
        const quantity = document.getElementById('quantity').value;
        const deliveryAddress = document.getElementById('deliveryAddress').value;
    
        // TODO: Send order details to the backend for processing (not implemented in this example)
    
        // Display order status message
        const statusMessage = document.getElementById('statusMessage');
        statusMessage.textContent = `Emergency order placed for ${quantity} ${itemName}(s). Delivering to ${deliveryAddress}.`;
    }
    
});

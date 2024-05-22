var setban=document.querySelector('.p-ban-choose')
var totalmoney=document.querySelector('.total')
var billItems = document.getElementById('billItems')
let selectedBan = null;
let totalAmount = 0;
function selectBan(event) {
    const parentDiv = event.currentTarget;
    const id = parentDiv.querySelector('.id_ban').textContent;
    const name = parentDiv.querySelector('.ten_ban').textContent;
    setban.textContent=`${name}`
    selectedBan = { id, name };
    console.log('Selected Ban:', selectedBan);
}

function selectDish(event) {
    const priceText = event.currentTarget.querySelector('.money').textContent;
    const price = parseInt(priceText.replace('Giá:', '').trim());
    const id = event.currentTarget.querySelector('.billItem')
    const itemName = event.currentTarget.querySelector('.water').textContent;
    var bilitem = document.createElement('li');
    bilitem.className = 'billItem'
    bilitem.textContent = `${itemName} - Giá: ${price}`;
    const deleteButton = document.createElement('p');
    deleteButton.textContent = 'X';
    deleteButton.addEventListener('click', () => {
        // Xóa giá của món từ tổng giá
        totalAmount -= price;
        updateTotalPrice();
        // Xóa mục hóa đơn khỏi DOM
        billItems.removeChild(bilitem);
    });
    bilitem.appendChild(deleteButton);
    billItems.appendChild(bilitem);
    totalAmount += price;
    totalmoney.textContent = `Tổng giá: ${totalAmount}`;
    console.log('Total Amount:', totalAmount);
}

function updateTotalPrice(){
    totalmoney.textContent = `Tổng giá: ${totalAmount}`
}
var DATE = new Date();
const today=DATE.getFullYear()+'/'+(DATE.getMonth()+1)+'/'+(DATE.getDay()+19)
function handlePayment() {
    if (!selectedBan) {
        alert('Please select a table first!');
        return;
    }

    console.log('Final Payment Data:', {
        mahoadon_id:'HD00'+Math.floor(Math.random()*5),
        maban_id: selectedBan.id,
        tongtien: totalAmount,
        day:today
    });
    saveToDatabase('HD00'+Math.floor(Math.random()*5),selectedBan.id, totalAmount,Date.parse(today));
    totalAmount=0
    billItems.textContent=''
    setban.textContent=''
}

function saveToDatabase(id, name, total,day) {
    const xhr = new XMLHttpRequest();
    xhr.open("POST", "/hoadons", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 201) {
            alert("Thanh toán thành công")
        }
    };
    const data = JSON.stringify({ mahoadon_id: id, maban_id: name, tongtien: total, ngayban: day });
    xhr.send(data);
}

document.addEventListener('DOMContentLoaded', function() {
    const banItems = document.querySelectorAll('.banchoose');
    banItems.forEach((item,index) => {
        item.addEventListener('click', selectBan);
    });

    const drinkItems = document.querySelectorAll('.drinkchoose');
    drinkItems.forEach(item => {
        item.addEventListener('click', selectDish);
    });
    document.getElementById('paymentButton').addEventListener('click', handlePayment);
});

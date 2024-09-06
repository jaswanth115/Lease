// src/AptBanner.js
import React from 'react';
import './AptBanner.css';
import { Card as BootstrapCard, Button } from 'react-bootstrap'; 

const AptBanner = ({ name = "Person", balanceDue = "$0.00", nextPayment = "$2400.00", dueDate = "mm/dd/yyyy", address = "Your flat address" }) => {
  return (
    <div className='banner_container'>
      <div className='info'>
        <div className='block'>
          <span class="bi bi-tencent-qq"></span>
          <h6 className="name">Welcome {name}</h6>
        </div>
        <div className='block'>
          <div className='balance_due'>Balance Due</div>
          <h3 className='amount'> {balanceDue}</h3>
        </div>
        <div className='block'>
          <span class="bi bi-calendar4-week"></span>
          <span className='payment_text'>Your next payment of {nextPayment} is due on {dueDate}</span>
        </div>
        <div className='block'>
          <span class="bi bi-geo-alt-fill"></span>
          <span className='address'>{address}</span>
        </div>
      </div>
      <div className='button_container'>
        <button className='btn setup_autopay'>Setup Auto-Pay</button>
        <button className='btn make_payment'>Make a Payment</button>
      </div>
    </div>
  );
};

export default AptBanner;

// src/Header.js
import React from 'react';
import './Header.css'; // Import the CSS file

const Header = () => {
  return (
    <div className='header-container'>
      <div className='nav'>
        <a className='nav-link' href="#home">Home</a>
        <a className='nav-link' href="#payments">Payments</a>
        <a className='nav-link' href="#insurance">Insurance</a>
        <a className='nav-link' href="#requests">Requests</a>
        <a className='nav-link' href="#announcements">Announcements</a>
      </div>
      <div className='profile-container'>
        <span className='profile-text'>John Doe</span>
        <span className='profile-text'>john.doe@example.com</span>
      </div>
    </div>
  );
};

export default Header;

import './App.css';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header';
import AptBanner from './components/AptBanner';
import Card from './components/Card';

function App() {
  return (
    <div className="App">
      <Header />
      <AptBanner 
        name="Jaswanth" 
        balanceDue="$0.00" 
        nextPayment="$2400.00" 
        dueDate="09/15/2024" 
        address="1234 Elm Street, Apartment 567, Your City, State" 
      />
      <div className='card-container-wrapper'>
      <Card />
      <Card />
      <Card />
    </div>
    </div>
  );
}

export default App;

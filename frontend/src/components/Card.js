// src/components/Card.js
import React from 'react';
import { Card as BootstrapCard, Button } from 'react-bootstrap';
import './Card.css'; // Import the CSS file for Card component

const Card = () => {
  return (
    <BootstrapCard className='fixed-card'>
      <BootstrapCard.Body>
        <BootstrapCard.Title>
          <i className="bi bi-bootstrap"></i> {/* Bootstrap icon */}
        </BootstrapCard.Title>
        <BootstrapCard.Subtitle className='mb-2 text-muted'>
          <strong>Bold Text</strong>
        </BootstrapCard.Subtitle>
        <BootstrapCard.Text>
          This is a paragraph of text within the card component.
        </BootstrapCard.Text>
        <Button variant="primary" className='rounded-button'>
          Action
        </Button>
      </BootstrapCard.Body>
    </BootstrapCard>
  );
};

export default Card;

import React from 'react';
import Navbar from './Components/Navbar/navbar';
import Hero from './Components/Hero/hero';

const App = () => {
  return (
    <div>
      <Navbar />
      <Hero />
      <section id="about" style={{ padding: '4rem 2rem', textAlign: 'center' }}>
        <h2>About Us</h2>
        <p>We are committed to revolutionizing transportation through electric vehicles.</p>
      </section>
      <section id="services" style={{ padding: '4rem 2rem', textAlign: 'center', backgroundColor: '#f4f4f4' }}>
        <h2>Our Services</h2>
        <p>Charging stations, EV consulting, and maintenance solutions.</p>
      </section>
      <section id="contact" style={{ padding: '4rem 2rem', textAlign: 'center' }}>
        <h2>Contact Us</h2>
        <p>Email: support@ev-website.com | Phone: +123456789</p>
      </section>
    </div>
  );
};

export default App;

import { render, screen } from '@testing-library/react';
import App from './App';

describe("<App />", () => {
 
  test('Render the title of the application', () => {
    render(<App />);
 
    const titleEl = screen.getByText("Calculate Edit Distance Between Two Strings");
    expect(titleEl).toBeInTheDocument();
  });
 
  test('Render Enter String 1', () => {
    render(<App />);
 
    const renderStr1El = screen.getByText("Enter string 1:");
    expect(renderStr1El).toBeInTheDocument();
  });
 
  test('Render Enter String 2', () => {
    render(<App />);
 
    const renderStr2El = screen.getByText("Enter string 2:");
    expect(renderStr2El).toBeInTheDocument();
  });

  test('Render Edit Distance Between Two Strings is', () => {
    render(<App />);
 
    const editDistBet2Str = screen.getByText("Edit Distance between the two strings is:");
    expect(editDistBet2Str).toBeInTheDocument();
  });
 
  test('render button', () => {
    const result = render(<App />);
 
    const calcButton = result.container.querySelector('#calculateEditDistanceBtn');
 
    expect(calcButton).toBeInTheDocument();
    expect(calcButton.textContent).toEqual("Calculate Edit Distance");

  });

  test('render input for string 1', () => {
    const result = render(<App />);
 
    const input1 = result.container.querySelector('#input1');
    expect(input1).toBeInTheDocument();
   });

 test('render input for string 2', () => {
    const result = render(<App />);
 
    const input2 = result.container.querySelector('#input2');
    expect(input2).toBeInTheDocument();
   });  
 
});

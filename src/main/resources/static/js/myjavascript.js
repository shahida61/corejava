function handleFormSubmit(event) {
  event.preventDefault(); // Prevent form from actually submitting
  const formData = new FormData(event.target);
  fetch("http://localhost:8585/Simple", {
  method: "POST",
  headers: {
    "Content-Type": "application/json",
  },
  body: JSON.stringify({
    fname: formData.get("fname"),
    lname: formData.get("lname"),
  }),
})
  .then((response) => {

    if (response.redirected) {
      // If redirected to another page (home.html), update the location
      console.log(response.redirected)
      window.location.href = response.url;
    } else if (response.ok) {
      return response.json();
    } else {
      console.error("Network response was not ok:", response.statusText);
    }
  })
  .then((data) => {
    if (data?.error) {
      console.error("Server Error:", data.error);
    }
  })
  .catch((error) => {
    console.error("Error fetching data:", error);
  });

}



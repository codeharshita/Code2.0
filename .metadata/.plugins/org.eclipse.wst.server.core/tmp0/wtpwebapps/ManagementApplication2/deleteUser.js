
 
 // Select the "Yes" button by its ID
const confirmDeleteButton = document.getElementById("confirm-delete-button");

// Add a click event listener to the "Yes" button
confirmDeleteButton.addEventListener("click", function () {
    // Get the user ID from the data attribute
    const userId = this.getAttribute("data-user-id");

    // Make a Fetch API request to delete the user
    fetch(`/delete?id=${userId}`, {
        method: "DELETE", // Use the DELETE HTTP method
    })
    .then((response) => {
        if (response.ok) {
            // User deleted successfully, you can handle the response or redirect as needed
            // For example, you can redirect to the user list page:
            window.location.href = "/list";
        } else {
            // Handle errors, show an alert, or provide feedback to the user
            alert("Failed to delete the user.");
        }
    })
    .catch((error) => {
        // Handle network errors
        console.error("Fetch error:", error);
    });
});

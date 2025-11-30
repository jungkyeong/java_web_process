console.log("TEST JS FILE LOADED");

document.addEventListener("DOMContentLoaded", () => {
    const button = document.getElementById("apiButton");
    const responseArea = document.getElementById("apiResponse");

    button.addEventListener("click", async () => {
        try {
            const response = await fetch("/api/hello"); // REST API 호출
            if (!response.ok) throw new Error("API 요청 실패");

            const text = await response.text(); // 문자열로 받기
            responseArea.textContent = "서버 응답: " + text;
        } catch (err) {
            responseArea.textContent = "에러 발생: " + err.message;
        }
    });
});
<TestMethod()> _
Public Sub IsLoginOK_BadPassword_ReturnsFalse()
    Dim userData As New UserData("user")
    userData.SetPassword("password")
    loginManager.AddUser(userData)
    Dim result As Boolean = loginManager.IsLoginOK("user", "badPassword")
    Assert.IsFalse(result, "Login should have failed for a bad password")
End Sub

<TestMethod()> _
Public Sub IsLoginOK_GoodPassword_ReturnsTrue()
    Dim userData As New UserData("user")
    userData.SetPassword("password")
    loginManager.AddUser(userData)
    Dim result As Boolean = loginManager.IsLoginOK("user", "password")
    Assert.IsTrue(result, _ "Login should have succeeded for a good password")
End Sub
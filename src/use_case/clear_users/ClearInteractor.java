package use_case.clear_users;

import entity.UserFactory;
// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary, UserFactory userFactory) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
        this.userFactory = userFactory;
    }

    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.clear());
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}

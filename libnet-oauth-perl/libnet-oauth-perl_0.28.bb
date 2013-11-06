SUMMARY = "Net::OAuth - OAuth 1.0 for Perl"
AUTHOR = "Keith Grennan <kgrennan@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Net::OAuth"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=b83d8b8b24fa2e42fe61e63f1ccb8f2a"

SRC_URI = "http://cpan.metacpan.org/authors/id/K/KG/KGRENNAN/Net-OAuth-0.28.tar.gz"
SRC_URI[md5sum] = "336d7fb22e945f014e1bce0f49fcfad9"
SRC_URI[sha256sum] = "7bfc319da0ac578e00962f35a350cf51110a3a313016d1fdc30722028a22904c"

S = "${WORKDIR}/Net-OAuth-${PV}"

do_configure_prepend () {
	sed -i 's:\./configure\(.[^-]\):./configure --build=${BUILD_SYS} --host=${HOST_SYS} --target=${TARGET_SYS} --prefix=${prefix} --exec_prefix=${exec_prefix} --bindir=${bindir} --sbindir=${sbindir} --libexecdir=${libexecdir} --datadir=${datadir} --sysconfdir=${sysconfdir} --sharedstatedir=${sharedstatedir} --localstatedir=${localstatedir} --libdir=${libdir} --includedir=${includedir} --oldincludedir=${oldincludedir} --infodir=${infodir} --mandir=${mandir}\1:' Build.PL
}

inherit cpan_build

do_compile() {
	perl Makefile.PL DESTDIR=${D} INSTALL_BIN=${bindir} LIBDIR=${libdir} BASELIBDIR=${base_libdir} MANDIR=${mandir}
	perl Build build 
}

do_install() {
	perl Build install #--install-base ${D}
}

RDEPENDS_${PN} += "libclass-data-inheritable-perl \
                   libclass-accessor-perl \
                   libdigest-hmac_sha1-perl \
                   libdigest-sha-perl \
                   libdigest-sha1-perl \
                   liblwp-useragent-perl \
                   liburi-escape-perl \
                   "

RPROVIDES_${PN} += "libnet-oauth-accesstoken-perl \
                    libnet-oauth-accesstokenrequest-perl \
                    libnet-oauth-accesstokenresponse-perl \
                    libnet-oauth-client-perl \
                    libnet-oauth-consumerrequest-perl \
                    libnet-oauth-message-perl \
                    libnet-oauth-protectedresourcerequest-perl \
                    libnet-oauth-request-perl \
                    libnet-oauth-requesttokenresponse-perl \
                    libnet-oauth-requesttokenrequest-perl \
                    libnet-oauth-response-perl \
                    libnet-oauth-signaturemethod-hmac_sha1-perl \
                    libnet-oauth-signaturemethod-hmac_sha256-perl \
                    libnet-oauth-signaturemethod-plaintext-perl \
                    libnet-oauth-signaturemethod-rsa_sha1-perl \
                    libnet-oauth-userauthrequest-perl \
                    libnet-oauth-userauthresponse-perl \
                    libnet-oauth-v1_0a-accesstokenrequest-perl \
                    libnet-oauth-v1_0a-requesttokenrequest-perl \
                    libnet-oauth-v1_0a-requesttokenresponse-perl \
                    libnet-oauth-xauthaccesstokenrequest-perl \
                    libnet-oauth-yahooaccesstokenrefreshrequest-perl \
                    "

BBCLASSEXTEND = "native"

